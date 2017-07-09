package me.irvincastellanos.angelhack.activity


import android.app.Fragment
import android.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import me.irvincastellanos.angelhack.R
import kotlinx.android.synthetic.main.activity_intro.*
import me.irvincastellanos.angelhack.fragment.GenderFragment

class IntroActivity : AppCompatActivity() {
    val TAG = IntroActivity::class.java.simpleName
    var mFragmentManager: FragmentManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        mFragmentManager = fragmentManager


        setFragment(GenderFragment())
    }

    public fun setFragment(fragment: Fragment) {
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}
