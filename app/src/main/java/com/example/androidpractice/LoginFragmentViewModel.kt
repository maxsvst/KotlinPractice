package com.example.androidpractice

import android.util.Log
import androidx.lifecycle.ViewModel

class LoginFragmentViewModel(private val navigate: Navigator): ViewModel() {

    fun isLoginAndPasswordMatch(password: String, login: String){
        if (password == login && password != "" && login != ""){
            navigate.navigateTo(LoginFragmentDirections.openWelcomeFragment(login))
        }
        else{
            Log.d("Error", "Логин и пароль не совпадают")
        }
    }

}