package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val context: Context, val ItemList: ArrayList<Item>):
    RecyclerView.Adapter<>() {

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val id = itemView?.findViewById<TextView>(R.id.list_item_text)
        val img = itemView?.findViewById<ImageView>(R.id.list_item_image)

        fun bind (item: Item, context: Context) {
            if (item.img != "") {
                val resourceId = context.resources.getIdentifier(item.img, "drawable", context.packageName)
                img?.setImageResource(resourceId)
            } else {
                img?.setImageResource(R.mipmap.ic_launcher)
            }
            id?.id = item.id
        }
    }

    // its return type is ???
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return ItemList.size
    }

    override fun onBindViewHolder(holder: ???, position: Int) {
        TODO("Not yet implemented")
    }
}