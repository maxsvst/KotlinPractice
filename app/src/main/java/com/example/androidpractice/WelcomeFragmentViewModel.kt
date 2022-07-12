package com.example.androidpractice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData

class WelcomeFragmentViewModel(private val itemsProvider: ItemsProvider): ViewModel() {

    val items: MutableLiveData<List<Item>> = liveData{
        emit(itemsProvider.getItems())
    } as MutableLiveData<List<Item>>

}