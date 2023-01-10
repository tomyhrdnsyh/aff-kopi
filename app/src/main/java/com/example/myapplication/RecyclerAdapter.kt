package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {


    private var title = arrayOf("Coffe Mmk", "Coffe Merah", "Coffe Hitam")
    private var type = arrayOf("Hot/Ice", "Hot/Ice", "Hot/Ice")
    private var stock = arrayOf("Stock 5", "Stock 5", "Stock 5")
    private var price = arrayOf("Rp. 21,000,000", "Rp. 24,000,000", "Rp. 22,000,000")
    private var image = intArrayOf(R.drawable.coffee, R.drawable.coffee, R.drawable.coffee)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = title[position]
        holder.itemType.text = type[position]
        holder.itemStock.text = stock[position]
        holder.itemPrice.text = price[position]
        holder.itemImage.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
        return title.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemType: TextView
        var itemStock: TextView
        var itemPrice: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemType = itemView.findViewById(R.id.item_type)
            itemStock = itemView.findViewById(R.id.item_stock)
            itemPrice = itemView.findViewById(R.id.item_price)
        }

    }
}