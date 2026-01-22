package com.example.appcomprayventa

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appcomprayventa.Fragmentos.FragmentChats
import com.example.appcomprayventa.Fragmentos.FragmentCuenta
import com.example.appcomprayventa.Fragmentos.FragmentMisAnuncios
import com.example.appcomprayventa.Fragmentos.FragmentoInicio
import com.example.appcomprayventa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        verFragmentInicio()

        binding.BottomNV.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.Item_Inicio->{
                    verFragmentInicio()
                    true
                }
                R.id.Item_Chats->{
                    verFragmentChats()
                    true
                }
                R.id.Item_Cuenta->{
                    verFragmentCuenta()
                    true
                }
                R.id.Item_Mis_Anuncios->{
                    verFragmentMisAnuncios()
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    private fun verFragmentInicio(){
        binding.TituloRL.text="Inicio"
        val fragment = FragmentoInicio()
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(binding.FragmentL1.id, fragment, "FragmentInicio")
        fragmentTransition.commit()
    }
    private fun verFragmentChats(){
        binding.TituloRL.text="Chats"
        val fragment = FragmentChats()
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(binding.FragmentL1.id, fragment, "FragmentChats")
        fragmentTransition.commit()
    }
    private fun verFragmentMisAnuncios(){
        binding.TituloRL.text="Mis Anuncios"
        val fragment = FragmentMisAnuncios()
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(binding.FragmentL1.id, fragment, "FragmentMisAnuncios")
        fragmentTransition.commit()
    }
    private fun verFragmentCuenta(){
        binding.TituloRL.text="Cuenta"
        val fragment = FragmentCuenta()
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(binding.FragmentL1.id, fragment, "FragmentCuenta")
        fragmentTransition.commit()
    }
}