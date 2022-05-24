package com.example.whatsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp.MyRvadapter
import com.example.whatsapp.R
import com.example.whatsapp.databinding.FragmentChatBinding

class ChatFragment : Fragment() {

    var dp_img = arrayOf(R.drawable.man,R.drawable.man,R.drawable.man,R.drawable.man,R.drawable.man)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_chat, container, false)
        val binding = FragmentChatBinding.inflate(inflater,container,false);

        var adapter = MyRvadapter(activity,dp_img)
        var layoutManager = LinearLayoutManager(activity)
        binding.recycler.layoutManager = layoutManager
        binding.recycler.adapter = adapter

        return binding.root
        return  view
    }

}