package me.irvincastellanos.angelhack.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import me.irvincastellanos.angelhack.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(this, LoginActivity::class.java))
    }
}
