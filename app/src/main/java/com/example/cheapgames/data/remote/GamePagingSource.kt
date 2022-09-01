package com.example.cheapgames.data.remote

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.cheapgames.model.Game
import com.example.cheapgames.util.GamesFilter
import kotlinx.coroutines.delay
import java.time.LocalDateTime


private const val STARTING_KEY = 0
private const val LOAD_DELAY_MILLIS = 3_000L

class GamePagingSource(
    private val gamesLibraryService: GamesLibraryService,
    private val gamesFilter: GamesFilter
) : PagingSource<Int, Game>() {
    override fun getRefreshKey(state: PagingState<Int, Game>): Int? {
        TODO("Not yet implemented")
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Game> {
        val nextPageNumber = params.key ?: STARTING_KEY

        TODO("Not yet implemented")
    }
}