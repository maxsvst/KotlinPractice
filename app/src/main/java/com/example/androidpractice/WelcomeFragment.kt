package com.example.androidpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter

class WelcomeFragment : Fragment() {

    private var adapter = ListDelegationAdapter(WelcomeFragmentDelegateAdapter.welcomeRecyclerViewAdapterDelegate)
    private val viewModelProvider by lazy {
        ViewModelProvider(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return WelcomeFragmentViewModel(ItemsProvider()) as T
            }
        })
    }
    private val viewModel: WelcomeFragmentViewModel by lazy {
        viewModelProvider[WelcomeFragmentViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.welcome_fragment_recycler_view)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
        viewModel.itemsLive.observe(
            viewLifecycleOwner
        ) {
            if (!it.isNullOrEmpty()) {
                    adapter.items = it
                }
            }
        }

    }