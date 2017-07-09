package me.irvincastellanos.angelhack.fragment

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_color.*
import kotlinx.android.synthetic.main.fragment_gender.*
import me.irvincastellanos.angelhack.R
import me.irvincastellanos.angelhack.activity.IntroActivity

/**
 * Created by positr0nix on 7/8/17.
 */
class ColorFragment: Fragment() {
    val TAG = ColorFragment::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_color, null)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        color1Btn.setOnClickListener {
            Log.d(TAG, "male")
            nextFragment()
        }

        color2Btn.setOnClickListener {
            Log.d(TAG, "female")
            nextFragment()
        }

        color3Btn.setOnClickListener {
            Log.d(TAG, "other")
            nextFragment()
        }

        color4Btn.setOnClickListener {
            Log.d(TAG, "other")
            nextFragment()
        }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onDetach() {
        super.onDetach()
    }

    private fun nextFragment() {
        var activity = activity as IntroActivity
        activity?.setFragment(StyleFragment())
    }
}