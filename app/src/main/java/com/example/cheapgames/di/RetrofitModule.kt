package com.example.cheapgames.di

import com.example.cheapgames.data.remote.GamesLibraryService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitModule {

    private val retrofit = Retrofit.Builder().addConverterFactory(provideConverterFactory())

    private fun provideConverterFactory(): GsonConverterFactory {
        return GsonConverterFactory.create()
    }

    fun provideGamesLibraryService(): GamesLibraryService =
        retrofit
            .baseUrl("https://www.cheapshark.com/api/1.0/")
            .build()
            .create(GamesLibraryService::class.java)
}