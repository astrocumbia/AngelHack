package me.irvincastellanos.angelhack.adapter

import android.content.Context
import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide

import kotlinx.android.synthetic.main.style_item_list.view.*
import me.irvincastellanos.angelhack.R
import me.irvincastellanos.angelhack.item.StyleItem
import me.irvincastellanos.angelhack.util.StyleMap

/**
 * Created by positr0nix on 7/8/17.
 */
class StyleAdapter(var list: List<StyleItem>) : RecyclerView.Adapter<StyleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent?.context)
                .inflate(R.layout.style_item_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        var item = list[position]

        //holder?.cardview
        holder?.image?.setImageResource(StyleMap.getDrawable(item.name))
        holder?.image?.setOnClickListener {
            if (item.like) {
                holder?.cardview?.setBackgroundColor(Color.CYAN)
            } else {
                holder?.cardview?.setBackgroundColor(Color.WHITE)
            }
            item.like = !item.like

        }
    }


    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val cardview = itemView?.cardviewStyleItem
        val image = itemView?.imgStyleItem
    }
}