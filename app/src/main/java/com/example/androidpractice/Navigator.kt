package com.example.androidpractice

import androidx.navigation.NavDirections

interface Navigator {
     fun navigateTo(direction: NavDirections)
}