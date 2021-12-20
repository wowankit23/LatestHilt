package com.test.codeglo.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J/\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ/\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\u0007j\b\u0012\u0004\u0012\u00020\u000e`\t0\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\'\u0010\u0010\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00110\u0007j\b\u0012\u0004\u0012\u00020\u0011`\t0\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/test/codeglo/repository/Repository;", "", "apiService", "Lcom/test/codeglo/network/ApiService;", "(Lcom/test/codeglo/network/ApiService;)V", "getAlbums", "Lretrofit2/Response;", "Ljava/util/ArrayList;", "Lcom/test/codeglo/model/UserAlbum;", "Lkotlin/collections/ArrayList;", "userId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPhotos", "Lcom/test/codeglo/model/UserPhoto;", "albumId", "getUsers", "Lcom/test/codeglo/model/UsersItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUsersWithFLOW", "Lkotlinx/coroutines/flow/Flow;", "Lcom/test/codeglo/utility/Resource;", "Lcom/test/codeglo/model/User;", "app_debug"})
public final class Repository {
    private final com.test.codeglo.network.ApiService apiService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.ArrayList<com.test.codeglo.model.UsersItem>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAlbums(int userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.ArrayList<com.test.codeglo.model.UserAlbum>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPhotos(int albumId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.ArrayList<com.test.codeglo.model.UserPhoto>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUsersWithFLOW(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.test.codeglo.utility.Resource<com.test.codeglo.model.User>>> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public Repository(@org.jetbrains.annotations.NotNull()
    com.test.codeglo.network.ApiService apiService) {
        super();
    }
}