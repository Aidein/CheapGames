package com.example.cheapgames.data.remote

import com.example.cheapgames.model.Game
import retrofit2.Response
import retrofit2.http.GET

interface GamesLibraryService {
    @GET("deals?onSale=1")
    suspend fun getGamesOnSale() : Response<List<Game>>
}