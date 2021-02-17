package com.zcdev.demo2021.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.zcdev.demo2021.Model.Data
import com.zcdev.demo2021.R

class PlaceAdapter(var context: Context, var lstPlace:ArrayList<Data>): BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
       var view=LayoutInflater.from(context).inflate(R.layout.viewcell,null)
        var holder=ViewHolder(view)
           holder.pname.text=lstPlace[position].pname
           holder.pdes.text=lstPlace[position].pdes
           holder.img.setBackgroundResource(lstPlace[position].pimg!!)


        return view
    }

    override fun getCount(): Int {
        return lstPlace.size
    }

    override fun getItem(position: Int): Any {
      return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }



}

internal class ViewHolder(view: View){
    var pname=view.findViewById<TextView>(R.id.txtPlaceName) as TextView
    var pdes=view.findViewById<TextView>(R.id.txtPlaceDes) as TextView
    var img=view.findViewById<ImageView>(R.id.imgPlace) as ImageView
    init {
        view.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
             Toast.makeText(view.context,"item is Clicked!! ",Toast.LENGTH_LONG).show()

            }

        })
    }
}