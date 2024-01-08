package com.spylypchuk.someapp.di

import com.spylypchuk.someapp.data.location.AndroidLocationTracker
import com.spylypchuk.someapp.domain.location.LocationTracker
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class LocationModule {

    @Binds
    @Singleton
    abstract fun bindLocationTracker(androidLocationTracker: AndroidLocationTracker): LocationTracker
}