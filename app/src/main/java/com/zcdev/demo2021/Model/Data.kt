package com.zcdev.demo2021.Model

class Data {
    var id:Int?=null
    var pimg:Int?=null
    var pname:String?=null
    var pdes:String?=null


    constructor(id: Int?, pimg: Int?, pname: String?, pdes: String?) {
        this.id = id
        this.pimg = pimg
        this.pname = pname
        this.pdes = pdes
    }

    constructor(nam:String){
        this.pname=nam
    }
}