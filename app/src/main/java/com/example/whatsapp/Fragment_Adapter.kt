package com.example.whatsapp

import android.telecom.Call
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.whatsapp.fragments.CallFragment
import com.example.whatsapp.fragments.ChatFragment
import com.example.whatsapp.fragments.StatusFragment

class Fragment_Adapter(mainActivity: MainActivity, supportFragmentManager: FragmentManager) :
    FragmentPagerAdapter(supportFragmentManager) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> ChatFragment()
            1 -> StatusFragment()
            else -> CallFragment()
        }
    }

}
