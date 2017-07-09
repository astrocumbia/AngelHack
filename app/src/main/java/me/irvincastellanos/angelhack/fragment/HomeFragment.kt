package me.irvincastellanos.angelhack.fragment

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.*
import me.irvincastellanos.angelhack.R
import me.irvincastellanos.angelhack.adapter.ProductAdapter
import me.irvincastellanos.angelhack.item.ProductItem
import me.irvincastellanos.angelhack.item.StoreItem
import me.irvincastellanos.angelhack.util.DataBase

/**
 * Created by positr0nix on 7/9/17.
 */
class HomeFragment : Fragment() {
    val TAG = HomeFragment::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_home, null)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        rcProductsList.layoutManager = LinearLayoutManager(activity)
        rcProductsList.adapter = ProductAdapter(activity, DataBase.getData())
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onDetach() {
        super.onDetach()
    }

}