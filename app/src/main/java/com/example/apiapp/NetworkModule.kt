package com.example.apiapp

import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

object NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit():Retrofit{
        return Retrofit.Builder().
                baseUrl("https://jsonplaceholder.typicode.com/").
                addConverterFactory(GsonConverterFactory.create()).
                build()

    }

    @Singleton
    @Provides
    fun provideAlbumApiService(retrofit: Retrofit):ApiService{

        return retrofit.create(ApiService::class.java)
    }

}