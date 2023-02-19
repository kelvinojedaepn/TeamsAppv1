package com.example.teamsappv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.teamsappv1.Adapter.ChatOptionAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    val activityFragment = ActivityFragment()
    val chatFragment= ChatFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottonNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottonNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.i_activity->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame_container, activityFragment).commit()
                }
                R.id.i_chat->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame_container, chatFragment).commit()
                }
            }
            true
        }
        supportFragmentManager.beginTransaction().replace(R.id.frame_container, chatFragment).commit()
    }


}