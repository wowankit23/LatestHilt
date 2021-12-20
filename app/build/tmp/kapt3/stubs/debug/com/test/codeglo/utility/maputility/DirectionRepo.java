package com.test.codeglo.utility.maputility;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0002J+\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ(\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/test/codeglo/utility/maputility/DirectionRepo;", "", "key", "", "(Ljava/lang/String;)V", "decodePoly", "", "Lcom/google/android/gms/maps/model/LatLng;", "encoded", "directionDataAsync", "Lcom/google/android/gms/maps/model/PolylineOptions;", "options", "from", "to", "(Lcom/google/android/gms/maps/model/PolylineOptions;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDirectionUrl", "currentLat", "", "currentLong", "destinationLat", "destinationLong", "app_debug"})
public final class DirectionRepo {
    private final java.lang.String key = null;
    
    private final java.lang.String getDirectionUrl(double currentLat, double currentLong, double destinationLat, double destinationLong) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object directionDataAsync(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.PolylineOptions options, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng from, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng to, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.android.gms.maps.model.PolylineOptions> p3) {
        return null;
    }
    
    private final java.util.List<com.google.android.gms.maps.model.LatLng> decodePoly(java.lang.String encoded) {
        return null;
    }
    
    public DirectionRepo(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        super();
    }
}