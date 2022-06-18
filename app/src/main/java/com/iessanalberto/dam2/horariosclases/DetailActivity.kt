package com.iessanalberto.dam2.horariosclases

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    private lateinit var imgItemDetail: ImageView
    private lateinit var tvTituloDetail: TextView
    private lateinit var tvDescripcionDetail: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initViews()
    }

    fun initViews(){

        imgItemDetail = findViewById(R.id.imgItemDetail)
        tvTituloDetail = findViewById(R.id.tvTituloDetail)
        tvDescripcionDetail = findViewById(R.id.tvDescripcionDetail)
    }


}