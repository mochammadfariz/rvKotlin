package com.example.rvkotlin.presenters

import android.content.Context
import com.example.rvkotlin.R
import com.example.rvkotlin.model.AndroidOS
import com.example.rvkotlin.model.AndroidOsContract

class AndroidOSPresenter(private val view:AndroidOsContract.View,private val context: Context):AndroidOsContract.Presenter{

    private val listAndroidOs = mutableListOf<AndroidOS>()

    override fun getDataAndroid() {
        val listOS = context.resources.getStringArray(R.array.android_os)

        listAndroidOs.clear()

        for (i in listOS.indices){
            listAndroidOs.add(AndroidOS(listOS[i]))
        }

        view.dataAndroid(listAndroidOs)
    }


}