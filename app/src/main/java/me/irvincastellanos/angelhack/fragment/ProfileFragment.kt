package me.irvincastellanos.angelhack.fragment

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.irvincastellanos.angelhack.R

/**
 * Created by positr0nix on 7/9/17.
 */
class ProfileFragment : Fragment() {
    val TAG = HomeFragment::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_profile, null)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        /*
        imgMaleGender.setOnClickListener {
            Log.d(TAG, "male")
            nextFragment()
        }

        imgFemaleGender.setOnClickListener {
            Log.d(TAG, "female")
            nextFragment()
        }

        imgOtherGender.setOnClickListener {
            Log.d(TAG, "other")
            nextFragment()
        }*/
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onDetach() {
        super.onDetach()
    }

}