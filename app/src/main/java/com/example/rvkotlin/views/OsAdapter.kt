package com.example.rvkotlin.views

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rvkotlin.R
import com.example.rvkotlin.model.AndroidOS
import kotlinx.android.synthetic.main.adapter_android_os.view.*

class OsAdapter(private val context: Context,private val listAndroidOS: List<AndroidOS>):RecyclerView.Adapter<OsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OsAdapter.ViewHolder =
        ViewHolder(LayoutInflater.from(context).inflate(R.layout.adapter_android_os,parent,false))


    override fun getItemCount(): Int =
        listAndroidOS.size


    override fun onBindViewHolder(holder: OsAdapter.ViewHolder, position: Int) {
            holder.bindAndroidOS(listAndroidOS[position])
    }
    inner class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        fun bindAndroidOS(androidOS: AndroidOS){
            itemView.androidOSText.text = androidOS.android
        }
    }
}