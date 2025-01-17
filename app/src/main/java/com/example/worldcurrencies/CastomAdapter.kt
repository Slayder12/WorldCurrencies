package com.example.worldcurrencies

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.worldcurrencies.models.ModelItem

class CustomAdapter(private val items: MutableList<ModelItem>) :
RecyclerView.Adapter<CustomAdapter.ItemViewHolder>()
{

    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val itemNameTV: TextView = itemView.findViewById(R.id.itemNameTV)
        val imageIV: ImageView = itemView.findViewById(R.id.imageIV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun getItemCount() = items.size

    @SuppressLint("NotifyDataSetChanged")
    fun updateData(newItems: MutableList<ModelItem>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]

        holder.itemNameTV.text = item.name
        holder.imageIV.setImageResource(item.image)
    }

}