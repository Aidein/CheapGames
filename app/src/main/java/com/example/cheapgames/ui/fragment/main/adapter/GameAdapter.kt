package com.example.cheapgames.ui.fragment.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import com.example.cheapgames.databinding.GameViewholderBinding
import com.example.cheapgames.model.Game

class GameAdapter : PagingDataAdapter<Game, GameViewHolder>(ARTICLE_DIFF_CALLBACK) {

    companion object {
        private val ARTICLE_DIFF_CALLBACK = object : DiffUtil.ItemCallback<Game>() {
            override fun areItemsTheSame(oldItem: Game, newItem: Game): Boolean =
                oldItem.dealID == newItem.dealID

            override fun areContentsTheSame(oldItem: Game, newItem: Game): Boolean =
                oldItem == newItem
        }
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val tile = getItem(position)
        if (tile != null) {
            holder.bind(tile)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder =
        GameViewHolder(
            GameViewholderBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

}