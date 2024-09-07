package com.example.apiapp

import retrofit2.http.GET

interface ApiService {

    @GET("albums")
    suspend fun getAlbums():List<Album>
}