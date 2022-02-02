package com.example.androidcustomviewexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list : MutableList<String> = ArrayList()
        list.add("Kotlin")
        list.add("Java")
        list.add("C++")
        list.add("Html")
        list.add("JavaScript")
        list.add("Php")

   
    }
}