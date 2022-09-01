package com.example.cheapgames.util

data class GamesFilter(
    val storeId: String? = null, // optional, comma separated list of stores
    val pageNumber: Int? = null, // optional, default 0
    val pageSize: Int? = null, // optional, default 60
    val sortBy: String? = null, // optional, default Deal Rating, Possible values = Deal Rating + Title + Savings + Price + Metacritic + Reviews + Release + Store + recent
    val desc: Int? = null, // optional, default 0 (descending order)
    val lowerPrice: Int? = null, // optional, default 0
    val upperPrice: Int? = null, //optional
    val metacritic: Int? = null, // optional, Minimum Metacritic rating for a game
    val steamRating: Int? = null, // optional, Minimum Steam reviews rating for a game
    val steamAppId: String? = null, // optional, Look for deals on specific games, comma separated list of Steam App ID (still bound by pageSize)
    val title: String? = null, // optional, Looks for the string contained anywhere in the game name
    val exact: Int? = null, // optional, default = 0, Flag to allow only exact string match for title parameter
    val aaa: Int? = null, // optional, default = 0, Flag to include only deals with retail price > $29
    val steamWorks: Int? = null, // optional, default = 0, Flag to include only deals that redeem on Steam (best guess, depends on store support)
    val onSale: Int? = null, // optional, default = 0, Flag to include only games that are currently on sale
    val output: String? = null // optional, Option to output deals in RSS format (overrides page number/size to 0/100)
)
