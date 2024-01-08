package com.spylypchuk.someapp.di

import android.content.Context
import com.spylypchuk.someapp.domain.repository.WeatherRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.java.KoinJavaComponent.get
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class SharedModule {

    @Provides
    @Singleton
    fun provideWeatherRepository(): WeatherRepository {
        return get(WeatherRepository::class.java)
    }

    companion object {
        fun init(context: Context) {
            startKoin {
                androidContext(context)
                modules(
                    sharedModule
                )
            }
        }
    }
}