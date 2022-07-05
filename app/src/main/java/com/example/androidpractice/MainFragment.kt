package com.example.androidpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.view.*


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        val loginInput: EditText = view.findViewById(R.id.loginInput)
        val passwordInput: EditText = view.findViewById(R.id.passwordInput)
        view.loginButton.setOnClickListener {
            val passwordInput = passwordInput.text.toString()
            val loginInput = loginInput.text.toString()
            if (passwordInput == loginInput && passwordInput != "" && loginInput != ""){
                findNavController().navigate(MainFragmentDirections.openWelcomeFragment(loginInput))
            } else {
                Toast.makeText(context, "Логин и пароль не совпадают", Toast.LENGTH_SHORT).show()
            }
        }
        return view
    }
}