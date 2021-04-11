package com.zcdev.demo2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.zcdev.demo2021.Model.Data
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    //Test
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTips.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                startActivity(Intent(this@MainActivity,tipsactivity::class.java))
            }
        })
        btnPlaces.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                startActivity(Intent(this@MainActivity,PlaceActivity::class.java))
            }
        })


    }
}
