package com.example.appcomprayventa


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appcomprayventa.Fragmentos.FragmentoInicio
import com.example.appcomprayventa.Fragmentos.FragmentCuenta
import com.example.appcomprayventa.Fragmentos.FragmentMisAnuncios
import com.example.appcomprayventa.Opciones_Login.ActivityLoginEmail
import com.example.appcomprayventa.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        comprobarSesion()

        verFragmentInicio()
        binding.BottomNV.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.Item_Inicio->{
                    true
                }
                R.id.Item_Chats->{
                    true
                }
                R.id.Item_Mis_Anuncios->{
                    true
                }
                R.id.Item_Cuenta->{
                    true
                }
                else -> {
                    false
                }
            }
        }
    }
    private fun comprobarSesion(){
        if(firebaseAuth.currentUser == null){
            startActivity(Intent(this, OpcionesLogin::class.java))
            finishAffinity()
        }
    }

    private fun verFragmentInicio(){
        binding.TituloRL.text = "Inicio"
        val fragment = FragmentoInicio()
        val fragmenteTransition = supportFragmentManager.beginTransaction()
        fragmenteTransition.replace(binding.FragmentL1.id, fragment, "FragmentInicio")
        fragmenteTransition.commit()
    }
    private fun verFragmentChats(){
        binding.TituloRL.text = "Chats"
        val fragment = FragmentCuenta()
        val fragmenteTransition = supportFragmentManager.beginTransaction()
        fragmenteTransition.replace(binding.FragmentL1.id, fragment, "FragmentChats")
        fragmenteTransition.commit()
    }
    private fun verFragmentMisAnuncios(){
        binding.TituloRL.text = "Mis Anuncios"
        val fragment = FragmentMisAnuncios()
        val fragmenteTransition = supportFragmentManager.beginTransaction()
        fragmenteTransition.replace(binding.FragmentL1.id, fragment, "FragmentMisAnuncios")
        fragmenteTransition.commit()
    }
    private fun verFragmentCuenta(){
        binding.TituloRL.text = "Cuenta"
        val fragment = FragmentCuenta()
        val fragmenteTransition = supportFragmentManager.beginTransaction()
        fragmenteTransition.replace(binding.FragmentL1.id, fragment, "FragmentCuenta")
        fragmenteTransition.commit()
    }
}