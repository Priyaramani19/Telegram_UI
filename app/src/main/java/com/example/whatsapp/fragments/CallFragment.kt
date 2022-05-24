package com.example.whatsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp.MyRvCallAdapter
import com.example.whatsapp.R
import com.example.whatsapp.databinding.FragmentCallBinding

class CallFragment : Fragment() {

    var call_img = arrayOf(R.drawable.man,R.drawable.man,R.drawable.man,R.drawable.man,R.drawable.man)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_call, container, false)
        var binding = FragmentCallBinding.inflate(inflater,container,false)


        var adapter = MyRvCallAdapter(activity,call_img)
        var layoutManager = LinearLayoutManager(activity)
        binding.recycler.layoutManager = layoutManager
        binding.recycler.adapter = adapter

        return binding.root
        return view
    }

}