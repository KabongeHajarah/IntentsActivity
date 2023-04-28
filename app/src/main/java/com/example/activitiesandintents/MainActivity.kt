package com.example.activitiesandintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var ivnext:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ivnext =findViewById(R.id.ivnext)

//       ivnext.setOnClickListener {
//            val intent=Intent(this,memActivity::class.java)
//            startActivity(intent)
//        }
   }
}