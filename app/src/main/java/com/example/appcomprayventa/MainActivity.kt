package com.example.appcomprayventa

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.BottomNV.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.Item_Inicio->{
                    true
                }
                R.id.Item_Chats->{
                    true
                }
                R.id.Item_Cuenta->{
                    true
                }
                R.id.Item_Mis_Anuncios->{
                    true
                }
                else -> {
                    false
                }
            }
        }
    }
}