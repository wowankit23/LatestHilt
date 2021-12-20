package com.test.codeglo.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u001a\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\nH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/test/codeglo/di/MapSingletonModule;", "", "()V", "provideDirectionRepo", "Lcom/test/codeglo/utility/maputility/DirectionRepo;", "context", "Landroid/content/Context;", "provideMapAnimator", "Lcom/test/codeglo/utility/maputility/MapAnimator;", "routeEvaluator", "Lcom/test/codeglo/utility/maputility/RouteEvaluator;", "providePolylineOptions", "Lcom/google/android/gms/maps/model/PolylineOptions;", "provideRouteEvaluator", "app_debug"})
@dagger.Module()
public final class MapSingletonModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.test.codeglo.di.MapSingletonModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.test.codeglo.utility.maputility.RouteEvaluator provideRouteEvaluator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.test.codeglo.utility.maputility.DirectionRepo provideDirectionRepo(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.android.gms.maps.model.PolylineOptions providePolylineOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.test.codeglo.utility.maputility.MapAnimator provideMapAnimator(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.test.codeglo.utility.maputility.RouteEvaluator routeEvaluator) {
        return null;
    }
    
    private MapSingletonModule() {
        super();
    }
}