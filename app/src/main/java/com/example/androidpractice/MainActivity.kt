package com.example.androidpractice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavDirections
import androidx.navigation.findNavController

class MainActivity: AppCompatActivity(), Navigator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun navigateTo(direction: NavDirections) {
        try {
            findNavController(R.id.nav_host_fragment).navigate(direction)
        } catch (exception: Exception) {
            Log.d("Error", exception.toString())
        }
    }
}