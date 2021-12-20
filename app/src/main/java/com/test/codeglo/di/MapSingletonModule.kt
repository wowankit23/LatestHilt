package com.test.codeglo.di

import android.content.Context
import androidx.core.content.ContextCompat
import com.google.android.gms.maps.model.PolylineOptions

import com.test.codeglo.R
import com.test.codeglo.utility.maputility.DirectionRepo
import com.test.codeglo.utility.maputility.MapAnimator
import com.test.codeglo.utility.maputility.RouteEvaluator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MapSingletonModule {

    @Singleton
    @Provides
    fun provideRouteEvaluator(): RouteEvaluator = RouteEvaluator()

    @Singleton
    @Provides
    fun provideDirectionRepo(@ApplicationContext context: Context): DirectionRepo =
        DirectionRepo(key = context.getString(R.string.maps_api_key))

    @Singleton
    @Provides
    fun providePolylineOptions(): PolylineOptions = PolylineOptions()


    @Singleton
    @Provides
    fun provideMapAnimator(
        @ApplicationContext context: Context,
        routeEvaluator: RouteEvaluator
    ): MapAnimator =
        MapAnimator(
            routeEvaluator = routeEvaluator,
            primary = ContextCompat.getColor(context, R.color.purple_700),
            second = ContextCompat.getColor(context, R.color.purple_200)
        )
}