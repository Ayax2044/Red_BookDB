package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
    }
    fun Karta (view: View){
        val bb1 : Button = findViewById(R.id.button)
        val intent: Intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun redbook(view: View){
        val bb2: Button = findViewById(R.id.button2)
        val intent: Intent = Intent(this, RedBook::class.java)
        startActivity(intent)
    }
}