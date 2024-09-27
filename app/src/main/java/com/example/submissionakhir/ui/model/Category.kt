package com.example.submissionakhir.ui.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.submissionakhir.R

data class Category(
    @DrawableRes val imageCategory: Int,
    @StringRes val textCategory : Int
)

val dummyCategory = listOf(
    R.drawable.icon_menu_lokasi to R.string.category_lokasi,
    R.drawable.icon_menu_penginapan to R.string.category_penginapan,
    R.drawable.icon_menu_paket to R.string.category_paketwisata,
    R.drawable.icon_menu_berita to R.string.category_berita,
    R.drawable.icon_menu_kuliner to R.string.category_kuliner
).map { Category(it.first,it.second) }