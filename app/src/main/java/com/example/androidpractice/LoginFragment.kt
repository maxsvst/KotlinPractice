package com.example.androidpractice

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun OnViewCreated() {
        val viewModel = ViewModelProvider(this)[LoginFragmentViewModel::class.java]
        val loginInput: EditText? = view?.findViewById(R.id.loginInput)
        val passwordInput: EditText? = view?.findViewById(R.id.passwordInput)
        val loginButton: Button? = view?.findViewById(R.id.loginButton)
        loginButton?.setOnClickListener() {
            val passwordInput = passwordInput?.text.toString()
            val loginInput = loginInput?.text.toString()
            viewModel.isLoginAndPasswordMatch(passwordInput, loginInput)
        }
    }
}