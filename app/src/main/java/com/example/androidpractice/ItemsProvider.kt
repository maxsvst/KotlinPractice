package com.example.androidpractice

class ItemsProvider {

    fun getItems(): List<Item> {
        val result = List(10) { number ->
                if (number % 2 == 0) {
                    Item.AItem("$number - AItem object")
                }
                else{
                    Item.BItem("$number - BItem object")
                }
            }
        Thread.sleep(1500)
        return result
    }
}