package com.example.rvkotlin.model

interface AndroidOsContract{
    //      function  untuk menghubungkan presenter dan view
    interface View{
        fun dataAndroid(listAndroid: List<AndroidOS>)
    }
    interface Presenter{
        fun getDataAndroid()
    }
}