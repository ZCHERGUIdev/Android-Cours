package com.zcdev.demo2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import com.zcdev.demo2021.Adapter.PlaceAdapter
import com.zcdev.demo2021.Model.Data
import kotlinx.android.synthetic.main.activity_place.*

class PlaceActivity : AppCompatActivity() {

      var lstplace=ArrayList<Data>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place)

        var p1=Data(1,R.drawable.place1,"place 1","description 1")
        var p2=Data(1,R.drawable.p2,"place 2","description 2")
        var p3=Data(1,R.drawable.p3,"place 3","description 3")
        var p4=Data(1,R.drawable.p5,"place 4","description 4")
        var p5=Data(1,R.drawable.p2,"place 5","description 5")
        var p6=Data(1,R.drawable.place1,"place 6","description 6")
        var p7=Data(1,R.drawable.place1,"place 6","description 6")
        var p8=Data(1,R.drawable.place1,"place 6","description 6")
        var p9=Data(1,R.drawable.place1,"place 6","description 6")
        var p10=Data(1,R.drawable.place1,"place 6","description 6")
        var p11=Data(1,R.drawable.place1,"place 6","description 6")
        var p12=Data(1,R.drawable.place1,"place 6","description 6")
        lstplace.add(p1)
        lstplace.add(p2)
        lstplace.add(p3)
        lstplace.add(p4)
        lstplace.add(p5)
        lstplace.add(p6)
        lstplace.add(p7)
        lstplace.add(p8)
        lstplace.add(p9)
        lstplace.add(p10)
        lstplace.add(p11)
        lstplace.add(p12)

        lstofPlaces.adapter=PlaceAdapter(this,lstplace)
    }
}