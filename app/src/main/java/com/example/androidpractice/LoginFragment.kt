package com.example.androidpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

//    private val viewModel: LoginFragmentViewModel = ViewModelProvider(this)[LoginFragmentViewModel::class.java]

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mainActivity: FragmentActivity = requireActivity()
        val navigator = mainActivity as Navigator
        val viewModelProvider by lazy {
            ViewModelProvider(this, object :ViewModelProvider.Factory{
                override fun <T : ViewModel> create(modelClass: Class<T>): T {
                    return LoginFragmentViewModel(navigator) as T
                }
            })
        }
       val loginFragmentViewModel: LoginFragmentViewModel by lazy{
            viewModelProvider[LoginFragmentViewModel::class.java]
        }
        val loginInput: EditText? = view.findViewById(R.id.loginInput)
        val passwordInput: EditText? = view.findViewById(R.id.passwordInput)
        val loginButton: Button? = view.findViewById(R.id.loginButton)
        loginButton?.setOnClickListener {
            val login: String = loginInput?.text.toString()
            val password: String = passwordInput?.text.toString()
            loginFragmentViewModel.isLoginAndPasswordMatch(password, login)
        }
    }

}