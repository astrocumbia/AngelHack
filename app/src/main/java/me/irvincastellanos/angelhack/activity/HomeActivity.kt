package me.irvincastellanos.angelhack.activity

import android.app.Fragment
import android.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*


import me.irvincastellanos.angelhack.R
import me.irvincastellanos.angelhack.adapter.ProductAdapter
import me.irvincastellanos.angelhack.item.ProductItem
import me.irvincastellanos.angelhack.item.StoreItem
import android.support.annotation.IdRes
import android.util.Log
import com.roughike.bottombar.OnTabReselectListener
import me.irvincastellanos.angelhack.R.id.bottomBar
import me.irvincastellanos.angelhack.fragment.*


class HomeActivity : AppCompatActivity() {

    var mFragmentManager: FragmentManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setSupportActionBar(toolbar)

        mFragmentManager = fragmentManager


        setFragment(HomeFragment())

        bottomBar.setOnTabSelectListener { tabId ->
            when {
                tabId == R.id.tab_home -> setFragment(HomeFragment())
                tabId == R.id.tab_notifications -> setFragment(NotificationFragments())
                tabId == R.id.tab_search -> setFragment(SearchFragment())
                tabId == R.id.tab_profile -> setFragment(ProfileFragment())
                else -> setFragment(HomeFragment())
            }
        }
    }

    public fun setFragment(fragment: Fragment) {
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
