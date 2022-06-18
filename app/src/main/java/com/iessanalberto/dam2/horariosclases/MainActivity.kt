package com.iessanalberto.dam2.horariosclases

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.iessanalberto.dam2.horariosclases.adaptador.AdaptadorItems

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        title="Horarios"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAulas = findViewById<Button>(R.id.btnAulas)
        val btnGrupos = findViewById<Button>(R.id.btnGrupos)
        val btnProfes = findViewById<Button>(R.id.btnProfe)

        btnAulas.setOnClickListener {
            startActivity(Intent(this, Recycler::class.java))
            startActivity(intent)
        }
    }
}