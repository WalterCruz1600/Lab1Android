package com.example.cruz

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var Boton:Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Boton=findViewById(R.id.button_MainActivity_Toast)

        setToast()


    }

    private fun setToast() {




        Boton.setOnClickListener {
            Toast.makeText(applicationContext, "Walter Alexander Cruz Coronado", Toast.LENGTH_SHORT)
                .show()
        }

    }

}