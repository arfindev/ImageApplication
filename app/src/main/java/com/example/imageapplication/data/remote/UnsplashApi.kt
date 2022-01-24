package com.example.imageapplication.data.remote

import com.example.imageapplication.BuildConfig
import com.example.imageapplication.data.remote.dto.ImageDtoItem
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {
    @Headers("Authorization Client-ID  ${BuildConfig.API_KEY}")
    @GET("/photos")
    suspend fun getPhotos(
        @Query("page") page: Int,
        @Query("per_page") per_page: Int,
    ): List<ImageDtoItem>

    @Headers("Authorization Client-ID  ${BuildConfig.API_KEY}")
    @GET("/search/photos")
    suspend fun searchPhotos(
        @Query("page") page: Int,
        @Query("per_page") per_page: Int,
    ): List<ImageDtoItem>
}