package com.example.androidpractice

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class LoginFragmentViewModel @Inject constructor(
//    private val navigator: Navigator
) : ViewModel() {
    fun isLoginAndPasswordMatch(loginInput: String, passwordInput: String) {
        if (passwordInput == loginInput && passwordInput != "" && loginInput != "") {

        } else {
            Log.d("Error", "Логин и пароль не совпадают")
        }
    }

    override fun onCleared() {
        super.onCleared()
    }
}