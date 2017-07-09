package me.irvincastellanos.angelhack.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*

import me.irvincastellanos.angelhack.R
import me.irvincastellanos.angelhack.adapter.ProductAdapter
import me.irvincastellanos.angelhack.item.ProductItem
import me.irvincastellanos.angelhack.item.StoreItem

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rcProductsList.layoutManager = LinearLayoutManager(this)
        rcProductsList.adapter = ProductAdapter(this, getData())
    }


    fun getData(): List<ProductItem> {
        return arrayListOf(
                ProductItem(1,
                        "NIKE AIR MAX 2017",
                        "https://images.nike.com/is/image/DotCom/PDP_HERO/849559_008_A_PREM/calzado-de-running-air-max-2017.jpg",
                        "h",
                        "Nike",
                        4.8,
                        arrayListOf(StoreItem("Liverpool",3800.0,"2 días"), StoreItem("Palacio de Hierro",4350.0,"1 día"), StoreItem("Sears",3800.0,"5 días"), StoreItem("Nike",3399.0,"1 día"))
                ),
                ProductItem(2,
                        "Tenis Metcon 2 Para Hombre",
                        "https://images.nike.com/is/image/DotCom/PDP_HERO/819899_005_A_PREM/calzado-de-entrenamiento-metcon-2.jpg",
                        "h",
                        "Nike",
                        4.5,
                        arrayListOf(StoreItem("Liverpool",1640.0,"2 días"), StoreItem("Palacio de Hierro",1100.0,"1 día"), StoreItem("Sears",1590.0,"5 días"), StoreItem("Nike",1758.0,"1 día"))
                )
        )
    }
}
