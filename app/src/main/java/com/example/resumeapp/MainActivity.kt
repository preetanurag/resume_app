package com.example.resumeapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("name",name.getText().toString())
            intent.putExtra("short_des",short_des.getText().toString())
            intent.putExtra("email",email.getText().toString())
            intent.putExtra("number",ph_no.getText().toString())
            intent.putExtra("city",city.getText().toString())
            intent.putExtra("linkedin",linkedin.getText().toString())
            intent.putExtra("github",github.getText().toString())
            intent.putExtra("work",work_expr.getText().toString())
            intent.putExtra("education",edu.getText().toString())

            startActivity(intent)

         val sharedPreferences=getSharedPreferences("preference", Context.MODE_PRIVATE)
            val editor=sharedPreferences.edit()
            editor.putString("name",name.getText().toString())
            editor.putString("short_des",short_des.getText().toString())
            editor.putString("email",email.getText().toString())
            editor.putString("number",ph_no.getText().toString())
            editor.putString("city",city.getText().toString())
            editor.putString("linkedin",linkedin.getText().toString())
            editor.putString("github",github.getText().toString())
            editor.putString("work",work_expr.getText().toString())
            editor.putString("education",edu.getText().toString())
            editor.apply()


        }
    }
}

