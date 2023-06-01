package com.example.ds1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            button.setBackgroundColor(Color.BLUE)
            val button: Button = findViewById(R.id.button)
            button.setOnClickListener {
                button.setBackgroundColor(Color.RED)
                val button: Button = findViewById(R.id.button)
                button.setOnClickListener { button.setBackgroundColor(Color.YELLOW) }
            }
        }
    }
}