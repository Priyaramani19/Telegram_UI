package com.example.whatsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp.MyRvStAdapter
import com.example.whatsapp.R
import com.example.whatsapp.databinding.FragmentStatusBinding

class StatusFragment : Fragment() {

    var st_img = arrayOf(R.drawable.man,R.drawable.man,R.drawable.man,R.drawable.man,R.drawable.man)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_status, container, false)
        val binding = FragmentStatusBinding.inflate(inflater,container,false)

        var adapter = MyRvStAdapter(activity,st_img)
        var layoutManager = LinearLayoutManager(activity)
        binding.recycler.layoutManager = layoutManager
        binding.recycler.adapter = adapter

        binding.stories.setImageResource(R.drawable.profile)

        return binding.root
        return view
    }

}