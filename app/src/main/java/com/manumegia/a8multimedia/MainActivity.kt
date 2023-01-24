package com.manumegia.a8multimedia

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.manumegia.a8multimedia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bElRElfo.setOnClickListener {
            binding.imgElRaza.setImageResource(R.drawable.jesucristo_elfo)
        }

        binding.bElREnano.setOnClickListener {
            binding.imgElRaza.setImageResource(R.drawable.jesucristoenano)
        }

        binding.bElRGoblin.setOnClickListener {
            binding.imgElRaza.setImageResource(R.drawable.jesucristo_goblin)
        }

        binding.bElRHumano.setOnClickListener {
            binding.imgElRaza.setImageResource(R.drawable.jesucristo_humano)
        }

        binding.bInicio.setOnClickListener {
            val intent = Intent(this, PantallaBlanco::class.java)
            startActivity(intent)
        }

    }
}