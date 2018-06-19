package com.erickrim.photoapp.api

import com.erickrim.photoapp.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

interface PhotoApi {

    @GET("?key=<key>&q=nature&image_type=photo")
    fun getPhotos(): Call<PhotoList>
}