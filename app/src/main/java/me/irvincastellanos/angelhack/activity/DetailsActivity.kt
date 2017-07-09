package me.irvincastellanos.angelhack.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.toolbar.*

import me.irvincastellanos.angelhack.R
import me.irvincastellanos.angelhack.adapter.StoreAdapter
import me.irvincastellanos.angelhack.item.ProductItem
import me.irvincastellanos.angelhack.util.DataBase
import me.irvincastellanos.angelhack.util.StyleMap

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        var id = getIntent().getIntExtra("ID", -1)

        var item: ProductItem = DataBase.getItem(id)

        Log.d("DetailsActivity", item.name)

        imgIcBrand?.setImageResource(StyleMap.getDrawable(item.brand))
        txtBrand?.text = item.brand
        priceProduct?.text = "$ "+String.format("%.2f",item.getMinPrice())
        txtTitleProduct?.text = item.name


        Glide.with(this)
                .load(item.image)
                .into(imgProduct);

        rcStoreList.layoutManager = LinearLayoutManager(this)
        rcStoreList.adapter = StoreAdapter(this, item.stores)

        setSupportActionBar(toolbar)
        supportActionBar?.setTitle(item?.name)
    }
}
