package com.example.services_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(),View.OnClickListener  {
    lateinit var startButton: Button
    lateinit var stopButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startButton=findViewById(R.id.startbutton)
        stopButton=findViewById(R.id.stopbutton)
        startButton!!.setOnClickListener(this)
        stopButton!!.setOnClickListener(this)

    }
   override fun onClick(view: View) {
        if (view==startButton) {
            startService(Intent(this, NewServices::class.java))
        }
        else if (view === stopButton) {
            stopService(Intent(this, NewServices::class.java))
        }
}}