package com.iessanalberto.dam2.horariosclases

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.iessanalberto.dam2.horariosclases.adaptador.AdaptadorItems
import com.iessanalberto.dam2.horariosclases.modelo.Items

class Recycler : AppCompatActivity(), AdaptadorItems.RecyclerItemClick {
    private lateinit var recycler: RecyclerView
    private lateinit var items: List<Items>
    private lateinit var adapter: AdaptadorItems

    //Aqui irian los horarios

    private fun getItems(): List<Items> {
        val items: MutableList<Items> = ArrayList()
        items.add(Items("DAM1", "Primer piso", R.drawable.sample1))
        items.add(Items("DAM2", "FP Informática", R.drawable.sample2))
        items.add(Items("SRM1", "FP Informática", R.drawable.sample3))
        items.add(Items("SMR2", "FP Informática", R.drawable.sample4))
        items.add(Items("Aula Magna", "Varios", R.drawable.sample5))
        items.add(Items("Aula Música", "Aula de música", R.drawable.sample6))
        items.add(Items("Biblioteca", "Varios", R.drawable.sample7))
        items.add(Items("Aula Apoyo", "Varios", R.drawable.sample8))
        items.add(Items("Cafeteria", "Varios", R.drawable.sample9))

        return items
    }

     override fun itemClick(item: Items) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("itemDetail", item)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        recycler = findViewById(R.id.recycler)
        val manager = LinearLayoutManager(this)
        recycler.layoutManager = manager

        items = getItems()
        adapter = AdaptadorItems(items, this)
        recycler.adapter = adapter


    }

}