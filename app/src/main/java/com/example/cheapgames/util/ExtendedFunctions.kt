package com.example.cheapgames.util

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.cheapgames.R

fun ImageView.loadImage(imageURL: String) {
    Glide
        .with(this)
        .load(imageURL)
        .placeholder(R.drawable.ic_launcher_background)
        .into(this)
}