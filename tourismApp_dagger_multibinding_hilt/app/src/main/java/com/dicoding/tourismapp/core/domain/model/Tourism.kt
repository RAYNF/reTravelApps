package com.dicoding.tourismapp.core.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Tourism(
    val tourismId: String,
    val name: String,
    val description: String,
    val addres: String,
    val latitude: Double,
    val longtitude: Double,
    val like: Int,
    val image: String,
    val isFavorite: Boolean
) : Parcelable
