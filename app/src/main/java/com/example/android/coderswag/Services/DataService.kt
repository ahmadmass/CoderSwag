package com.example.android.coderswag.Services

import com.example.android.coderswag.Model.Category
import com.example.android.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )
    val hats = listOf(
        Product("Graphic Beenie", "$18", "hat1"),
        Product("Hat Black", "$20", "hat2"),
        Product("Hat White", "$18", "hat3"),
        Product("Hat Snapback", "$22", "hat4")
    )
    val hoodies = listOf(
        Product("Hoodie gray", "$28", "hoodie1"),
        Product("Hoodie red", "$32", "hoodie2"),
        Product("Hoodie yellow", "$28", "hoodie3"),
        Product("Hoodie black", "$32", "hoodie4")
    )
    val shirts = listOf(
        Product("shirt gray", "$28", "shirt1"),
        Product("shirt red", "$32", "shirt2"),
        Product("shirt yellow", "$28", "shirt3"),
        Product("shirt black", "$32", "shirt4"),
        Product("Kick Flip Studios", "18", "shirt5")
    )
}