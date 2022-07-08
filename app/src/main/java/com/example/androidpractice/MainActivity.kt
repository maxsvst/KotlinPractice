package com.example.androidpractice

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavDirections
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Navigator {
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