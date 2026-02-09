package com.example.appcomprayventa.Opciones_Login

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appcomprayventa.R
import com.example.appcomprayventa.RegistroEmail
import com.example.appcomprayventa.databinding.ActivityLoginEmailBinding

class ActivityLoginEmail : AppCompatActivity() {
    private lateinit var binding: ActivityLoginEmailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginEmailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.TxtRegistrarse.setOnClickListener {
            startActivity(Intent (this@ActivityLoginEmail, RegistroEmail::class.java))
        }
    }
}