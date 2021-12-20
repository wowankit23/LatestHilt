package com.test.codeglo.repository

import com.test.codeglo.model.UserAlbum
import com.test.codeglo.model.UserPhoto
import com.test.codeglo.model.UsersItem
import com.test.codeglo.network.ApiService
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(private val apiService: ApiService){

    suspend fun getUsers(): Response<ArrayList<UsersItem>> {
        return apiService.getUsers()
    }

    suspend fun getAlbums(userId:Int): Response<ArrayList<UserAlbum>> {
        return apiService.getAlbums(userId)
    }

    suspend fun getPhotos(albumId:Int): Response<ArrayList<UserPhoto>> {
        return apiService.getPhotos(albumId)
    }
}