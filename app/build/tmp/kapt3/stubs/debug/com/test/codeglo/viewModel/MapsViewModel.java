package com.test.codeglo.viewModel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0007J\u000e\u0010.\u001a\u00020/2\u0006\u0010*\u001a\u00020+J\u000e\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020!J\u000e\u00102\u001a\u00020)2\u0006\u0010*\u001a\u00020+R\u0014\u0010\r\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/test/codeglo/viewModel/MapsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/test/codeglo/repository/Repository;", "networkHelper", "Lcom/test/codeglo/utility/NetworkHelper;", "directionRepo", "Lcom/test/codeglo/utility/maputility/DirectionRepo;", "polylineOptions", "Lcom/google/android/gms/maps/model/PolylineOptions;", "mapAnimator", "Lcom/test/codeglo/utility/maputility/MapAnimator;", "(Lcom/test/codeglo/repository/Repository;Lcom/test/codeglo/utility/NetworkHelper;Lcom/test/codeglo/utility/maputility/DirectionRepo;Lcom/google/android/gms/maps/model/PolylineOptions;Lcom/test/codeglo/utility/maputility/MapAnimator;)V", "REQUEST_LOCATION_PERMISSION", "", "getREQUEST_LOCATION_PERMISSION", "()I", "getDirectionRepo", "()Lcom/test/codeglo/utility/maputility/DirectionRepo;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "latitude", "", "getLatitude", "()D", "setLatitude", "(D)V", "longitude", "getLongitude", "setLongitude", "getMapAnimator", "()Lcom/test/codeglo/utility/maputility/MapAnimator;", "note", "", "getNote", "()Ljava/lang/String;", "setNote", "(Ljava/lang/String;)V", "getPolylineOptions", "()Lcom/google/android/gms/maps/model/PolylineOptions;", "enableMyLocation", "", "context", "Landroid/content/Context;", "map", "Lcom/google/android/gms/maps/GoogleMap;", "isPermissionGranted", "", "save", "string", "updateCoordinates", "app_debug"})
public final class MapsViewModel extends androidx.lifecycle.ViewModel {
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private double latitude = 0.0;
    private double longitude = 0.0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String note = "Your note goes here!";
    private final int REQUEST_LOCATION_PERMISSION = 1;
    private final com.test.codeglo.repository.Repository repository = null;
    private final com.test.codeglo.utility.NetworkHelper networkHelper = null;
    @org.jetbrains.annotations.NotNull()
    private final com.test.codeglo.utility.maputility.DirectionRepo directionRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.gms.maps.model.PolylineOptions polylineOptions = null;
    @org.jetbrains.annotations.NotNull()
    private final com.test.codeglo.utility.maputility.MapAnimator mapAnimator = null;
    
    public final double getLatitude() {
        return 0.0;
    }
    
    public final void setLatitude(double p0) {
    }
    
    public final double getLongitude() {
        return 0.0;
    }
    
    public final void setLongitude(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNote() {
        return null;
    }
    
    public final void setNote(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getREQUEST_LOCATION_PERMISSION() {
        return 0;
    }
    
    public final boolean isPermissionGranted(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void enableMyLocation(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap map) {
    }
    
    public final void updateCoordinates(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.test.codeglo.utility.maputility.DirectionRepo getDirectionRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.PolylineOptions getPolylineOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.test.codeglo.utility.maputility.MapAnimator getMapAnimator() {
        return null;
    }
    
    @javax.inject.Inject()
    public MapsViewModel(@org.jetbrains.annotations.NotNull()
    com.test.codeglo.repository.Repository repository, @org.jetbrains.annotations.NotNull()
    com.test.codeglo.utility.NetworkHelper networkHelper, @org.jetbrains.annotations.NotNull()
    com.test.codeglo.utility.maputility.DirectionRepo directionRepo, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.PolylineOptions polylineOptions, @org.jetbrains.annotations.NotNull()
    com.test.codeglo.utility.maputility.MapAnimator mapAnimator) {
        super();
    }
}