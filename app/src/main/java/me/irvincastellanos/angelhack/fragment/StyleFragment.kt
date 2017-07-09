package me.irvincastellanos.angelhack.fragment

import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_style.*
import me.irvincastellanos.angelhack.R
import me.irvincastellanos.angelhack.activity.HomeActivity
import me.irvincastellanos.angelhack.activity.IntroActivity
import me.irvincastellanos.angelhack.adapter.StyleAdapter
import me.irvincastellanos.angelhack.item.StyleItem
import me.irvincastellanos.angelhack.util.StyleMap

/**
 * Created by positr0nix on 7/8/17.
 */
class StyleFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_style, null)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        rcStyle.layoutManager = GridLayoutManager(activity, 3)
        rcStyle.adapter = StyleAdapter(getData())

        txtNextStyle.setOnClickListener {
            nextFragment()
        }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onDetach() {
        super.onDetach()
    }

    fun getData(): List<StyleItem> {
        return arrayListOf<StyleItem>(
                StyleItem(StyleMap.CLASIC,false),
                StyleItem(StyleMap.COSPLAY,false),
                StyleItem(StyleMap.HIPPIE,false),
                StyleItem(StyleMap.HIPSTER,false),
                StyleItem(StyleMap.LOLITA,false),
                StyleItem(StyleMap.ROCKER,false),
                StyleItem(StyleMap.SPORT,false),
                StyleItem(StyleMap.VINTAGE,false),
                StyleItem(StyleMap.OFFICE,false)
            )
    }

    private fun nextFragment() {
        startActivity(Intent(activity, HomeActivity::class.java))
        activity.finish()
    }
}