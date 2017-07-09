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
        rcProductsList.adapter = ProductAdapter(activity, getData())
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onDetach() {
        super.onDetach()
    }

    fun getData(): List<ProductItem> {
        return arrayListOf(
                ProductItem(1,
                        "Nike Air max 2017",
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
                ),
                ProductItem(3,
                        "Blusa Lisa Guess",
                        "https://media.elpalaciodehierro.com/media/catalog/product/cache/1/image/600x600/9df78eab33525d08d6e5fb8d27136e95/3/8/38042070_palaciodehierro_blusahalfslvhadley_guess_vista_1.jpg",
                        "m",
                        "Guess",
                        5.0,
                        arrayListOf(StoreItem("Liverpool",625.0,"6 a 9 días"), StoreItem("Palacio de Hierro",712.0,"5 días"), StoreItem("Sears",750.0,"7 días"))
                ),
                ProductItem(4,
                    "Blusa Janise Top",
                    "http://cdn.osom.com/p/levis-4173-856891-1-zoom2.jpg",
                    "m",
                    "Levis",
                    4.0,
                    arrayListOf(StoreItem("Liverpool",1050.0,"2 días"), StoreItem("Palacio de Hierro",1200.0,"3 días"), StoreItem("Levis",999.0,"2 días"))
                ),
                ProductItem(5,
                        "Jeans Innovation Super Skinny\t",
                        "http://cdn.osom.com/p/levis-3096-616891-1-zoom2.jpg",
                        "h",
                        "Levis",
                        4.2,
                        arrayListOf(StoreItem("Liverpool",1325.0,"1 días"), StoreItem("Palacio de Hierro",1250.0,"2 días"), StoreItem("Levis",1390.0,"2 días"))
                ),
                ProductItem(6,
                        "Playera SS BASIC GUESS MAG V NECK TEE",
                        "https://s7d5.scene7.com/is/image/Guess/M71332K5PZ1-TWHT?\$2014_G_xlarge\$&id=cT_Rt0&wid=333&hei=500&fmt=jpg",
                        "h",
                        "Guess",
                        3.9,
                        arrayListOf(StoreItem("Liverpool",790.0,"1 días"), StoreItem("Palacio de Hierro",840.0,"1 días"), StoreItem("Guess",680.0,"2 días"))
                ),
                ProductItem(7,
                        "Original Fit Jeans Electric Shock",
                        "http://lsco.scene7.com/is/image/lsco/Levi/clothing/005012327-front-grid.jpg",
                        "h",
                        "Levis",
                        3.9,
                        arrayListOf(StoreItem("Liverpool",950.0,"7 días"), StoreItem("Palacio de Hierro",999.0,"5 días" ), StoreItem("Levis",900.0,"7 días"))
                ),
                ProductItem(8,
                        "Vestido LS AVALENE BODYCON DRESS",
                        "https://s7d5.scene7.com/is/image/Guess/W64K82K54I0-JBLK?\$2014_G_xlarge\$&id=gVeSp1&wid=333&hei=500&fmt=jpg",
                        "m",
                        "Guess",
                        4.5,
                        arrayListOf(StoreItem("Liverpool",1890.0,"1 días"), StoreItem("Palacio de Hierro",2050.0,"3 días"), StoreItem("Guess",1992.0,"3 días"))
                ),
                ProductItem(9,
                        "Blusa lisa Guess de algodón",
                        "https://ss545.liverpool.com.mx/xl/1055837955.jpg",
                        "m",
                        "Guess",
                        5.0,
                        arrayListOf(StoreItem("Liverpool",455.0,"6 días"), StoreItem("Palacio de Hierro",650.0,"5 días"), StoreItem("Guess",449.0,"7 días"))
                ),
                ProductItem(10,
                        "Camisa Barstow Western Plaid",
                        "http://cdn.osom.com/p/levis-6503-143091-1-zoom2.jpg",
                        "h",
                        "Levis",
                        4.8,
                        arrayListOf(StoreItem("Liverpool",879.0,"2 días"), StoreItem("Palacio de Hierro",890.0,"3 días"), StoreItem("Levis",799.0,"1 días"))
                ),
                ProductItem(11,
                        "Zapato para Caballero ICE",
                        "http://demandware.edgesuite.net/sits_pod35/dw/image/v2/ABAD_PRD/on/demandware.static/-/Sites-calvinklein-hk-master/default/dwfdf21388/images/hi-res/S1583FT-BLK/S1583FT-BLK-ITEM-1.jpg",
                        "h",
                        "Calvin Klein",
                        4.0,
                        arrayListOf(StoreItem("Liverpool",2045.0,"1 días"), StoreItem("Palacio de Hierro",2050.0,"1 días"), StoreItem("Kalvin Klein", 1995.0,"2 días"))
                ),
                ProductItem(12,
                        "Tenis NIKECOURT ZOOM",
                        "https://images.nike.com/is/image/DotCom/PDP_HERO/812937_106_A_PREM/calzado-de-tenis-court-zoom-vapor-9-5-tour-qs.jpg",
                        "m",
                        "Nike",
                        4.5,
                        arrayListOf(StoreItem("Liverpool",2375.0,"1 días"), StoreItem("Palacio de Hierro",2410.0,"2 día"), StoreItem("Sears",2350.0,"3 días"), StoreItem("Nike",2499.0,"1 día"))
                ),
                ProductItem(13,
                        "Blusa Guess de corte recto",
                        "https://media.elpalaciodehierro.com/media/catalog/product/cache/1/image/600x600/9df78eab33525d08d6e5fb8d27136e95/3/8/38042020_palaciodehierro_blusaslkendallknottedshell_guess_vista_1.jpg",
                        "m",
                        "Guess",
                        5.0,
                        arrayListOf(StoreItem("Liverpool",952.0,"5 días"), StoreItem("Palacio de Hierro",1200.0,"7 días"), StoreItem("Sears",1350.0,"6 días"))
                )
        )
    }
}