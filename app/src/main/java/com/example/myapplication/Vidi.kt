package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.asLiveData
import com.example.fitnesapp.datbas.Item
import com.example.fitnesapp.datbas.MainDB
import com.example.myapplication.databinding.ActivityVidiBinding

class Vidi : AppCompatActivity() {
    lateinit var binding: ActivityVidiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVidiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val db = MainDB.getDB(this)
        db.getDao().getAllItem().asLiveData().observe(this){list->
            binding.textView32.text=""
            list.forEach{
                val text = "${it.name}      ${it.price}\n"
                binding.textView32.append(text)
            }
        }
        binding.button9.setOnClickListener {
            val item = Item(null,
                binding.editTextText5.text.toString(),
                binding.editTextText6.text.toString()
            )
            Thread{
                db.getDao().insertItem(item)
            }.start()
        }
    }
}