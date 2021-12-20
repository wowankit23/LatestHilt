package com.test.codeglo.utility.maputility;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015J\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/test/codeglo/utility/maputility/MapAnimator;", "", "routeEvaluator", "Lcom/test/codeglo/utility/maputility/RouteEvaluator;", "primary", "", "second", "(Lcom/test/codeglo/utility/maputility/RouteEvaluator;II)V", "backgroundPolyline", "Lcom/google/android/gms/maps/model/Polyline;", "firstRunAnimSet", "Landroid/animation/AnimatorSet;", "foregroundPolyline", "optionsForeground", "Lcom/google/android/gms/maps/model/PolylineOptions;", "secondLoopRunAnimSet", "animateRoute", "", "map", "Lcom/google/android/gms/maps/GoogleMap;", "bangaloreRoute", "", "Lcom/google/android/gms/maps/model/LatLng;", "clear", "setRouteIncreaseForward", "endLatLng", "app_debug"})
public final class MapAnimator {
    private com.google.android.gms.maps.model.Polyline backgroundPolyline;
    private com.google.android.gms.maps.model.Polyline foregroundPolyline;
    private com.google.android.gms.maps.model.PolylineOptions optionsForeground;
    private android.animation.AnimatorSet firstRunAnimSet;
    private android.animation.AnimatorSet secondLoopRunAnimSet;
    private final com.test.codeglo.utility.maputility.RouteEvaluator routeEvaluator = null;
    private final int primary = 0;
    private final int second = 0;
    
    public final void clear() {
    }
    
    public final void animateRoute(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap map, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.gms.maps.model.LatLng> bangaloreRoute) {
    }
    
    /**
     * This will be invoked by the ObjectAnimator multiple times. Mostly every 16ms.
     */
    public final void setRouteIncreaseForward(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng endLatLng) {
    }
    
    public MapAnimator(@org.jetbrains.annotations.NotNull()
    com.test.codeglo.utility.maputility.RouteEvaluator routeEvaluator, int primary, int second) {
        super();
    }
}