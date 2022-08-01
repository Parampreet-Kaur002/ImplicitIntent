package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.io.LineNumberReader

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var btnClick: Button
        lateinit var btnClick2: Button
        lateinit var btnClick3: Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnClick=findViewById(R.id.btnClick)
        btnClick2=findViewById(R.id.btnClick2)
        btnClick3=findViewById(R.id.btnClick3)
        btnClick.setOnClickListener {
            var intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("http://www.google.com"))
            startActivity(intent)
        }
        btnClick2.setOnClickListener {
            var intent=Intent(Intent.ACTION_DIAL)
            startActivity(intent)
        }
        btnClick3.setOnClickListener {
            var intent: Intent(Intent.ACTION_SHARE)
        }

    }
}