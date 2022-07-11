package com.example.androidpractice

class ItemsProvider {

    fun getItems(): List<Item> {
        val aItem = AItem("AItem object")
        val bItem = BItem("BItem object")
        val result = List(10) { numbers ->
            if (numbers % 2 == 0) {
                aItem
            } else {
                bItem
            }
        }
        Thread.sleep(1500)
        return result
    }
}