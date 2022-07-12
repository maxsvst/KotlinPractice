package com.example.androidpractice

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData

class WelcomeFragmentViewModel(private val itemsProvider: ItemsProvider): ViewModel() {

    private val items: LiveData<List<Item>> =
    liveData {
        emit(itemsProvider.getItems())
    }

    val itemsLive
    get() = items
}