package com.example.cheapgames.ui.fragment.main.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.cheapgames.databinding.GameViewholderBinding
import com.example.cheapgames.model.Game
import com.example.cheapgames.util.loadImage

class GameViewHolder(
    private val binding: GameViewholderBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(game: Game) {
        binding.apply {
            title.text = game.title
            steamRating.text = game.steamRatingText
            gamePrice.text = game.salePrice
            gameRealPrice.text = game.normalPrice
            gameThumbnail.loadImage(game.thumb)
        }
    }

}