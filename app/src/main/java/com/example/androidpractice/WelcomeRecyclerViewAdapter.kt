package com.example.androidpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WelcomeRecyclerViewAdapter :
    RecyclerView.Adapter<WelcomeRecyclerViewAdapter.MyViewHolder>() {

    private var items = listOf<Item>()

    fun setList(list: List<Item>) {
        items = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    class MyViewHolder(itemsView: View) : RecyclerView.ViewHolder(itemsView) {
        private val textView: TextView = itemsView.findViewById(R.id.recycler_view_item_text)
        fun bind(item: Item) {
            when (item) {
                is AItem -> {
                    textView.text = item.title
                }
                is BItem -> {
                    textView.text = item.title
                }
            }
        }
    }
}
