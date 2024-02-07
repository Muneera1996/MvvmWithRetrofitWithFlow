package com.example.mvvmwithretrofitwithflow.data

import com.example.mvvmwithretrofitwithflow.data.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

//    @GET("API/MostPopularMovies/k_9v5jw2c1")
//    suspend fun getMostPopularMovies() : MovieResponse

    @GET("movie/popular")
    suspend fun getAllMovies(@Query("api_key") apiKey: String?): MovieResponse

}