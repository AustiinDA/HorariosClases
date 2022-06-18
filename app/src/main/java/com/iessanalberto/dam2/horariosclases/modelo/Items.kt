package com.iessanalberto.dam2.horariosclases.modelo

import java.io.Serializable

class Items : Serializable {
    private lateinit var nombre: String
    private lateinit var descripcion: String
    private var imgResource: Int = 0

    constructor(nombre: String, descripcion: String, imgResource: Int) {
        this.nombre = nombre
        this.descripcion = descripcion
        this.imgResource = imgResource
    }

    fun getNombre(): String? {
        return nombre
    }

    fun getDescripcion(): String? {
        return descripcion
    }

    fun getImgResource(): Int {
        return imgResource
    }
}