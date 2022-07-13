package com.example.androidpractice

import android.widget.TextView
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

object WelcomeFragmentDelegateAdapter {

    val welcomeRecyclerViewAdapterDelegate =
        adapterDelegate<Item, Item>(R.layout.fragment_welcome) {

        }

    val aItemAdapterDelegate = adapterDelegate<Item.AItem, Item>(R.layout.recycler_item) {

        val aitemtext: TextView = findViewById(R.id.recycler_view_item_text)

        bind {
            aitemtext.text = item.title
        }
    }

    val bItemAdapterDelegate = adapterDelegate<Item.BItem, Item>(R.layout.recycler_item) {

        val bitemtext: TextView = findViewById(R.id.recycler_view_item_text)

        bind {
            bitemtext.text = item.title
        }
    }

}