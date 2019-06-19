package com.example.rvkotlin.views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.rvkotlin.R
import com.example.rvkotlin.model.AndroidOS
import com.example.rvkotlin.model.AndroidOsContract
import com.example.rvkotlin.presenters.AndroidOSPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),AndroidOsContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val presenter = AndroidOSPresenter(this,this)
        presenter.getDataAndroid()
    }

    override fun dataAndroid(listAndroid: List<AndroidOS>) {

            recyclerViewAndroidOS.layoutManager = LinearLayoutManager(this@MainActivity)
            recyclerViewAndroidOS.adapter = OsAdapter(this@MainActivity,listAndroid)
            (recyclerViewAndroidOS.adapter as OsAdapter).notifyDataSetChanged()


    }
}
