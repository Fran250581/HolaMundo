package com.example.fran.com.holamundo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Hola Mundo", "Entramos en onCreate()")
        super.onCreate(savedInstanceState)

        //Se introduce un error para depurarlo con logcat
        var error: Int? = null
        if(0 >= error!!){ }

        setContentView(R.layout.activity_main)
    }
}
