package me.irvincastellanos.angelhack.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.util.Log
import com.facebook.CallbackManager
import kotlinx.android.synthetic.main.activity_login.*

import me.irvincastellanos.angelhack.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.facebook.FacebookException
import com.facebook.login.LoginResult
import com.facebook.FacebookCallback
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FacebookAuthProvider
import com.facebook.AccessToken
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import me.irvincastellanos.angelhack.model.ModelUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase




class LoginActivity : AppCompatActivity() {

    val TAG: String = "LoginActivity"

    /****************************
     * Attributes of this class *
     */
    var mAuth: FirebaseAuth = FirebaseAuth.getInstance()
    var mCallbackManager: CallbackManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mCallbackManager = CallbackManager.Factory.create();
        login_button.setReadPermissions("email", "public_profile")

        checkValidUser(FirebaseAuth.getInstance().currentUser)

        login_button.registerCallback(mCallbackManager, object : FacebookCallback<LoginResult> {
            override fun onSuccess(loginResult: LoginResult) {
                Log.d(TAG, "facebook:onSuccess:" + loginResult)
                handleFacebookAccessToken(loginResult.accessToken)
            }

            override fun onCancel() {
                Log.d(TAG, "facebook:onCancel")
                // ...
            }

            override fun onError(error: FacebookException) {
                Log.d(TAG, "facebook:onError", error)
                // ...
            }
        })

        Log.d("LoginActivity", "===>")

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        super.onActivityResult(requestCode, resultCode, data)

        // Pass the activity result back to the Facebook SDK
        mCallbackManager?.onActivityResult(requestCode, resultCode, data)
    }

    fun checkValidUser(user: FirebaseUser?) {
        if (user != null) {

            val firebaseUser = ModelUser(user?.displayName.toString(), user?.email.toString(), user?.photoUrl.toString(), user?.uid.toString())
            val database = FirebaseDatabase.getInstance()
            val myRef = database.getReference("USER")
            myRef.child(firebaseUser.uid).setValue(firebaseUser)

            startActivity(Intent(this, IntroActivity::class.java))

        } else {
            Log.w("Login", "You don't have account")
        }

    }

    private fun handleFacebookAccessToken(token: AccessToken) {
        Log.w(TAG, "handlefacebookAccessToken")
        val credential = FacebookAuthProvider.getCredential(token.token)
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, object : OnCompleteListener<AuthResult> {
                    override fun onComplete(task: Task<AuthResult>) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            val user = mAuth.currentUser
                            checkValidUser(user)
                        }
                    }
                })
    }
}
