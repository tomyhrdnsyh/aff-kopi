package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapterCheckout: RecyclerView.Adapter<RecyclerAdapterCheckout.ViewHolder>() {

    private var title = arrayOf("Coffe Mmk", "Coffe Merah", "Coffe Merah", "Coffe Merah", "Coffe Merah")
    private var type = arrayOf("Hot", "Ice", "Ice", "Ice", "Ice")
    private var qty = arrayOf("2", "1", "1", "3", "5")
    private var price = arrayOf("21,000,000", "24,000,000", "24,000,000", "24,000,000", "24,000,000")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.checkout_detail_card, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = title[position]
        holder.itemType.text = type[position]

        holder.itemPrice.setText("Rp. ")
        holder.itemPrice.append(price[position])

        holder.itemQty.setText("Qty : ")
        holder.itemQty.append(qty[position])
    }

    override fun getItemCount(): Int {
        return title.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemType: TextView
        var itemQty: TextView
        var itemPrice: TextView
        var deleteCo: ImageView

        init {
            itemImage = itemView.findViewById(R.id.item_image_co)
            itemTitle = itemView.findViewById(R.id.item_title_co)
            itemType = itemView.findViewById(R.id.item_type_co)
            itemPrice = itemView.findViewById(R.id.item_price_co)
            itemQty = itemView.findViewById(R.id.item_qty)
            deleteCo = itemView.findViewById(R.id.delete_co)

            deleteCo.setOnClickListener{
                val position: Int = adapterPosition
                Toast.makeText(itemView.context, "${title[position]} deleted", Toast.LENGTH_SHORT).show()
            }
        }
    }
}