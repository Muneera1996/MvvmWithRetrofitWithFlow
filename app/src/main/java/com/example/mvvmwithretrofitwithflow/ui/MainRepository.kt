package com.example.mvvmwithretrofitwithflow.ui

import com.example.mvvmwithretrofitwithflow.data.ApiService
import com.example.mvvmwithretrofitwithflow.data.NetworkResult
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getPopularMovies()  = flow {
        emit(NetworkResult.Loading(true))
        val response = apiService.getAllMovies("9c3d0a8e43df6e8f6b44c230e53a94dd")
       emit(NetworkResult.Success(response.items))
    }.catch { e ->
        emit(NetworkResult.Failure(e.message ?: "Unknown Error"))
    }
}