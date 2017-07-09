package me.irvincastellanos.angelhack.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.store_item_list.view.*
import me.irvincastellanos.angelhack.R
import me.irvincastellanos.angelhack.item.ProductItem
import me.irvincastellanos.angelhack.item.StoreItem
import me.irvincastellanos.angelhack.util.StyleMap

/**
 * Created by positr0nix on 7/9/17.
 */
class StoreAdapter(val ctx: Context, var list: List<StoreItem>) : RecyclerView.Adapter<StoreAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): StoreAdapter.ViewHolder {
        val view: View = LayoutInflater.from(parent?.context)
                .inflate(R.layout.store_item_list, parent, false)
        return StoreAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: StoreAdapter.ViewHolder?, position: Int) {
        var item = list[position]

        holder?.imgStore?.setImageResource(StyleMap.getDrawable(item.name))
        holder?.txtDelivery?.text = item?.deliveryTime
        holder?.txtPrice?.text = String.format("$ %.2f",item?.price)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val imgStore = itemView?.imgStore
        val txtDelivery = itemView?.txtDelivery
        val txtPrice = itemView?.txtPrice
    }
}