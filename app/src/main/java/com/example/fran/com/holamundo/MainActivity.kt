package com.example.fran.com.holamundo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        val errorCompiled: Int = null //Esto no compilara

        var text: String = "I'm a String, Everything is Ok" //Asignacion valida

        text = null //Generara el mismo error de compilacion




        setContentView(R.layout.activity_main)
    }
}
