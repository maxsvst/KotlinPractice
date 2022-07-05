package com.example.androidpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_welcome.view.*

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_welcome, container, false)
        val loginArgument = WelcomeFragmentArgs.fromBundle(this.requireArguments())
        view.welcomeTextView.text = "Welcome, " + loginArgument.savedLogin.toString()
        return view
    }
}