package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.asLiveData
import com.example.fitnesapp.database.MainDatBas
import com.example.fitnesapp.database.predmet
import com.example.myapplication.databinding.ActivitySecurityBinding

class Security : AppCompatActivity() {
    lateinit var binding: ActivitySecurityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecurityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val db = MainDatBas.getDaBa(this)
        db.getDaO().getAllpredmet().asLiveData().observe(this){list->
            binding.textlist.text=""
            list.forEach{
                val text = "${it.name}       ${it.price}\n"
                binding.textlist.append(text)
            }
        }
        binding.btn.setOnClickListener {
            val predmet = predmet(null,
                binding.edname.text.toString(),
                binding.edprace.text.toString()
            )
            Thread{
                db.getDaO().insertpredmet(predmet)
            }.start()
        }
    }
}