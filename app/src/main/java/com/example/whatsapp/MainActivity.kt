package com.example.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener

class MainActivity : AppCompatActivity() {
    lateinit var view_pager: ViewPager
    lateinit var tab_View: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding()

        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = this.resources.getColor(R.color.statusbar)

        tab_View.addTab(tab_View.newTab().setText("Chats"))
        tab_View.addTab(tab_View.newTab().setText("Status"))
        tab_View.addTab(tab_View.newTab().setText("Calls"))

        var adapter = Fragment_Adapter(this,supportFragmentManager)
        view_pager.adapter = adapter

        view_pager.addOnPageChangeListener(TabLayoutOnPageChangeListener(tab_View))

        tab_View.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                view_pager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })
    }

    fun binding()
    {
        tab_View =findViewById<TabLayout>(R.id.tab_View)
        view_pager=findViewById<ViewPager>(R.id.view_pager)
    }
}