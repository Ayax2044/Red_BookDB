package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RedBook : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_red_book)
    }
    fun im1 (view: View){
        val bb1 : ImageView = findViewById(R.id.ima1)
        val intent: Intent = Intent(this, Vidi::class.java)
        startActivity(intent)
    }
    fun im2 (view: View){
        val bb1 : ImageView = findViewById(R.id.ima2)
        val intent: Intent = Intent(this, Opisanie::class.java)
        startActivity(intent)
    }

    fun im3 (view: View){
        val bb1 : ImageView = findViewById(R.id.ima3)
        val intent: Intent = Intent(this, Security::class.java)
        startActivity(intent)
    }
    fun im4 (view: View){
        val bb1 : ImageView = findViewById(R.id.ima4)
        val intent: Intent = Intent(this, History::class.java)
        startActivity(intent)
    }
}