package com.example.androidpractice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    class NavigationImplementation(private val fragment: Fragment): INavigation{
        override fun navigateTo(direction: NavDirections) {
            try{
                fragment.findNavController().navigate(direction)
            }
            catch (exception: Exception){
                Log.d("Error", exception.toString())
            }
        }
    }
}