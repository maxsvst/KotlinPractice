package com.example.androidpractice

sealed interface Item{

data class AItem(val title: String): Item

data class BItem(val title: String): Item}