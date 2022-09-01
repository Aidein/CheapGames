package com.example.cheapgames.data.remote

import com.example.cheapgames.model.Game
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GamesLibraryService {

    @GET("deals")
    suspend fun getGames(
        @Query("onSale") onSale: Int,
        @Query("pageSize") pageSize: Int,
        @Query("pageNumber") pageNumber: Int
    ): Response<List<Game>>

}