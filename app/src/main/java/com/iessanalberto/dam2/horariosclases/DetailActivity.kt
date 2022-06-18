package com.iessanalberto.dam2.horariosclases

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.iessanalberto.dam2.horariosclases.modelo.Items

class DetailActivity : AppCompatActivity() {

    private lateinit var imgItemDetail: ImageView
    private lateinit var tvTituloDetail: TextView
    private lateinit var tvDescripcionDetail: TextView
    private lateinit var itemDetail: Items


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initViews()
        initValues()

    }

    private fun initViews(){
        imgItemDetail = findViewById(R.id.imgItemDetail)
        tvTituloDetail = findViewById(R.id.tvTituloDetail)
        tvDescripcionDetail = findViewById(R.id.tvDescripcionDetail)
    }

    private fun initValues() {
        itemDetail = intent.extras?.getSerializable("itemDetail") as Items
        imgItemDetail.setImageResource(itemDetail.getImgResource())
        tvTituloDetail.text = itemDetail.getNombre()
        tvDescripcionDetail.text = itemDetail.getDescripcion()
    }
}