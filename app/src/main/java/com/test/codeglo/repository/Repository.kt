package com.test.codeglo.repository

import com.test.codeglo.model.User
import com.test.codeglo.model.UserAlbum
import com.test.codeglo.model.UserPhoto
import com.test.codeglo.model.UsersItem
import com.test.codeglo.network.ApiService
import com.test.codeglo.utility.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
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

    suspend fun getUsersWithFLOW(): Flow<Resource<User>> {
        return flow {
            val result = apiService.getUsersFLOW()
            emit(result)
        }.flowOn(Dispatchers.IO)
    }
}