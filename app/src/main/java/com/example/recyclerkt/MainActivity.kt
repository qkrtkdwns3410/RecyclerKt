package com.example.recyclerkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList = arrayListOf(
                profiles(R.drawable.man,"박상준",27,"무직"),
                profiles(R.drawable.woman,"신지애",27,"회사원"),
                profiles(R.drawable.man,"김성근",66,"무직"),
                profiles(R.drawable.woman,"박근혜",66,"무직"),
                profiles(R.drawable.man,"문재인",66,"무직"),
                profiles(R.drawable.man,"이명박",66,"무직"),
                profiles(R.drawable.man,"박상준",27,"무직"),
                profiles(R.drawable.woman,"박상준",27,"무직"),
                profiles(R.drawable.man,"박상준",27,"무직"),
                profiles(R.drawable.man,"박상준",27,"무직"),
                profiles(R.drawable.man,"박상준",27,"무직")


        )
        rv_profile.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv_profile.setHasFixedSize(true)

        rv_profile.adapter = profileAdapter(profileList)
    }
}