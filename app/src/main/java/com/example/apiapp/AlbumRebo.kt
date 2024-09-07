package com.example.apiapp

import javax.inject.Inject

class AlbumRebo @Inject constructor(private val apiService: ApiService) {

    suspend fun getAlbums():List<Album>{

       return apiService.getAlbums()
    }

}