package com.test.codeglo.network

import retrofit2.Response
import retrofit2.http.GET
import com.test.codeglo.model.User
import com.test.codeglo.model.UserAlbum
import com.test.codeglo.model.UserPhoto
import com.test.codeglo.model.UsersItem
import com.test.codeglo.utility.Resource
import dagger.Provides
import retrofit2.http.Path

/**
 * Retrofit API Service
 */
interface ApiService {

    @GET("users")
    suspend fun  getUsers(): Response<ArrayList<UsersItem>>


    @GET("users/{id}/albums")
    suspend fun getAlbums(@Path("id") userId: Int): Response<ArrayList<UserAlbum>>


    @GET("albums/{id}/photos")
    suspend fun getPhotos(@Path("id") albumId: Int): Response<ArrayList<UserPhoto>>

    @GET("users")
    suspend fun  getUsersFLOW(): Resource<User>

}