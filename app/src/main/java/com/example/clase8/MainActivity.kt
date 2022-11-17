package com.example.clase8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton= findViewById<Button>(R.id.button4)
        boton.setOnClickListener(){
            activar(findViewById<EditText>(R.id.editTextTextPassword).text.toString())
        }
    }

   private fun activar(texto: String){
        //val texto= findViewById<EditText>(R.id.editTextTextPassword).text.toString()
        val toast = Toast.makeText(applicationContext, texto , Toast.LENGTH_LONG)
        toast.show()
    }
}