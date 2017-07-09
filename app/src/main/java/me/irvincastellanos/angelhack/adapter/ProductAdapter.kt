package me.irvincastellanos.angelhack.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.product_item_list.view.*
import me.irvincastellanos.angelhack.R
import me.irvincastellanos.angelhack.item.ProductItem

/**
 * Created by positr0nix on 7/9/17.
 */
class ProductAdapter(var ctx: Context, var list:List<ProductItem>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        var item = list[position]

        holder?.txtBrand?.text = item.brand
        holder?.priceProduct?.text = item.getMaxPrice().toString()
        holder?.txtTitleProduct?.text = item.name

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent?.context)
                .inflate(R.layout.product_item_list, parent, false)
        return ProductAdapter.ViewHolder(view)
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        var imgIcBrand = itemView?.imgIcBrand
        var txtBrand = itemView?.txtBrand
        var imgProduct = itemView?.imgProduct
        var priceProduct = itemView?.priceProduct
        var txtTitleProduct = itemView?.txtTitleProduct
    }
}