package com.example.simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var but1:Button
    lateinit var but2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      but1=findViewById(R.id.button)


        but1.setOnClickListener { Toast.makeText(applicationContext, "Hello world", Toast.LENGTH_LONG) .show()


        }

    }

    fun button2(view: android.view.View) {


        Toast.makeText(applicationContext, "Hello world", Toast.LENGTH_LONG).show()
    }
}