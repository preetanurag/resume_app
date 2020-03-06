package com.example.resumeapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val i=intent
        val n=i.getStringExtra("name")
        val s=i.getStringExtra("short_des")
        val e=i.getStringExtra("email")
        val no=i.getStringExtra("number")
        val c=i.getStringExtra("city")
        val l=i.getStringExtra("linkedin")
        val g=i.getStringExtra("github")
        val w=i.getStringExtra("work")
        val ed=i.getStringExtra("education")

        name2.text=n
        short_des2.text=s
        email2.text=e
        number2.text=no
        city2.text=c
        linkedin2.text=l
        github2.text=g
        work_exp.text=w
        edu2.text=ed
        //val sharedPreferences=getSharedPreferences("PREFERENCE", Context.MODE_PRIVATE)



    }
}
