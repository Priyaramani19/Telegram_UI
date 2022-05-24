package com.example.whatsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView

class MyRvCallAdapter(val activity: FragmentActivity?, val call_img: Array<Int>) : RecyclerView.Adapter<MyRvCallAdapter.ViewData>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewData {
        var view = LayoutInflater.from(activity).inflate(R.layout.call_item,parent,false)

        return ViewData(view)
    }

    override fun onBindViewHolder(holder: ViewData, position: Int) {
        holder.call_dp.setImageResource(call_img[position])
    }

    override fun getItemCount(): Int {
        return call_img.size
    }

    class ViewData(itemView: View) : RecyclerView.ViewHolder(itemView){
        var call_dp = itemView.findViewById<ImageView>(R.id.call_dp)
    }

}