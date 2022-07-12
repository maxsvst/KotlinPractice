package com.example.androidpractice

import kotlinx.coroutines.delay

class ItemsProvider {

   suspend fun getItems(): List<Item> {
        val result = List(10) { number ->
                if (number % 2 == 0) {
                    Item.AItem("$number - AItem object")
                }
                else{
                    Item.BItem("$number - BItem object")
                }
            }
        delay(1000L)
        return result
    }
}