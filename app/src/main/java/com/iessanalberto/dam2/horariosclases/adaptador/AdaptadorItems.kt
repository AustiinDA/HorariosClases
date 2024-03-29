package com.iessanalberto.dam2.horariosclases.adaptador


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.iessanalberto.dam2.horariosclases.DetailActivity
import com.iessanalberto.dam2.horariosclases.R
import com.iessanalberto.dam2.horariosclases.Recycler
import com.iessanalberto.dam2.horariosclases.modelo.Items


class AdaptadorItems(items: List<Items>, itemClick: Recycler) :
    RecyclerView.Adapter<AdaptadorItems.ItemViewHolder>() {

    private var items: List<Items>
    private var originalItems: List<Items>
    private var itemClick: RecyclerItemClick

    init {
        this.items = items
        this.itemClick = itemClick
        this.originalItems = ArrayList()
    }


    class ItemViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        var itemImage: ImageView = view.findViewById(R.id.imgAula)
        var itemTitle: TextView = view.findViewById(R.id.nombreAula)
        var itemDetail: TextView = view.findViewById(R.id.descripcion)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.filas, parent, false)
        return ItemViewHolder(v)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item: Items = items[position]
        holder.itemTitle.text = item.getNombre()
        holder.itemDetail.text = item.getDescripcion()
        holder.itemImage.setImageResource(item.getImgResource())

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra("itemDetail", item)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    interface RecyclerItemClick {
        fun itemClick(item: Items)
    }
}





