package com.example.clase8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.DatePicker

class Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val boton1= findViewById<Button>(R.id.button)
        val boton2= findViewById<Button>(R.id.button2)
        val boton3= findViewById<Button>(R.id.button3)

         val fecha= findViewById<EditText>(R.id.editTextDate)

        boton1.setOnClickListener{
            val intent1= Intent(this,MainActivity::class.java)
            startActivity(intent1)
        }

        boton2.setOnClickListener{
            val intent2= Intent(this,MainActivity2::class.java)
            startActivity(intent2)
        }

        boton3.setOnClickListener{
            val intent3= Intent(this,MainActivity3::class.java)
            startActivity(intent3)
        }

        fecha.setOnClickListener {
            //showDatePickerDialog()
        }
    }
}