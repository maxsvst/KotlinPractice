package com.example.androidpractice

sealed interface Item{

data class AItem(val id: Int, val title: String): Item

data class BItem(val id: Int, val title: String): Item}