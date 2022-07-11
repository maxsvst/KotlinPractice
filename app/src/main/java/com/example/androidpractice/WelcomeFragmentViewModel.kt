package com.example.androidpractice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WelcomeFragmentViewModel(private val itemsProvider: ItemsProvider): ViewModel() {

    val items = MutableLiveData<List<Item>>()

    fun getItems(){
        items.value = itemsProvider.getItems()
    }
}