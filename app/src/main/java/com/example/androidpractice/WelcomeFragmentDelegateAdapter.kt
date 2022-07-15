package com.example.androidpractice

import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

class welcomeCallback(private val oldList: List<Item>, private val newList: List<Item>) :
    DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldList[oldItemPosition]
        val newItem = newList[newItemPosition]
        var areItemsTheSame = true
        if (oldItem is Item.BItem && newItem is Item.BItem) {
            areItemsTheSame = oldItem.id == newItem.id
        } else if (oldItem is Item.AItem && newItem is Item.AItem) {
            areItemsTheSame = oldItem.id == newItem.id
        } else if (oldItem is Item.AItem && newItem is Item.BItem || oldItem is Item.BItem && newItem is Item.AItem) {
            areItemsTheSame = false
        }
        return areItemsTheSame
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldList[oldItemPosition]
        val newItem = newList[newItemPosition]
        var areContentsTheSame = true
        if (oldItem is Item.BItem && newItem is Item.BItem) {
            areContentsTheSame = oldItem == newItem
        } else if (oldItem is Item.AItem && newItem is Item.AItem) {
            areContentsTheSame = oldItem == newItem
        } else if (oldItem is Item.AItem && newItem is Item.BItem || oldItem is Item.BItem && newItem is Item.AItem) {
            areContentsTheSame = false
        }
        return areContentsTheSame
    }

}

object WelcomeFragmentDelegateAdapter {
    
    val aItemAdapterDelegate = adapterDelegate<Item.AItem, Item>(R.layout.recycler_item) {
        val aitemtext: TextView = findViewById(R.id.recycler_view_item_text)
        bind {
            //проверять пэйлоад
            //равен ли тайтл предыдущего текующему и е
            //в массив строку тайт чендж
            //empty list если айтем или контнент отличаются
            aitemtext.text = item.id.toString() + " - " + item.title
        }
    }

    val bItemAdapterDelegate = adapterDelegate<Item.BItem, Item>(R.layout.recycler_item) {
        val bitemtext: TextView = findViewById(R.id.recycler_view_item_text)
        bind {
            bitemtext.text = item.id.toString() + " - " + item.title
        }
    }

}