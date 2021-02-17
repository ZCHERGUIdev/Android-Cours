package com.zcdev.demo2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.zcdev.demo2021.Model.Data
import kotlinx.android.synthetic.main.activity2.*

class tipsactivity : AppCompatActivity() {
    var lstStringdata=ArrayList<String>()
    var lstdata: ArrayAdapter<String>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)




          var d1= Data("Mohamed")
      var d2=Data("zakaria")
      var d3=Data("aimen")
      var d4=Data("omar")
      var d5=Data("hossem")
      lstStringdata.add(d1.pname.toString())
      lstStringdata.add(d2.pname.toString())
      lstStringdata.add(d3.pname.toString())
      lstStringdata.add(d4.pname.toString())
      lstStringdata.add(d5.pname.toString())

      var adapter=ArrayAdapter(this.baseContext,R.layout.viewcelltips,R.id.txtName,lstStringdata)
      lstnameView.adapter=adapter

       lstnameView.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->

           Toast.makeText(this.baseContext,"position "+id.toString(),Toast.LENGTH_LONG).show()
       })




    }
}