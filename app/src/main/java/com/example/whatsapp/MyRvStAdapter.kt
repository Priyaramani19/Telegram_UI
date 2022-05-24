package com.example.whatsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView

class MyRvStAdapter(val activity: FragmentActivity?, val st_img: Array<Int>) : RecyclerView.Adapter<MyRvStAdapter.ViewData>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewData {
        var view = LayoutInflater.from(activity).inflate(R.layout.st_item,parent,false)

        return ViewData(view)
    }

    override fun onBindViewHolder(holder: ViewData, position: Int) {
        holder.st_dp.setImageResource(st_img[position])
    }

    override fun getItemCount(): Int {
        return  st_img.size
    }

    class ViewData(itemView: View) : RecyclerView.ViewHolder(itemView){
        var st_dp = itemView.findViewById<ImageView>(R.id.st_dp)
    }

}
