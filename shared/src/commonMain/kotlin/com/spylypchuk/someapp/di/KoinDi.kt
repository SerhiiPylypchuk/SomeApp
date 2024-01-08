package com.spylypchuk.someapp.di

import com.spylypchuk.someapp.data.remote.WeatherApi
import com.spylypchuk.someapp.data.remote.WeatherApiImpl
import com.spylypchuk.someapp.data.repository.WeatherRepositoryImpl
import com.spylypchuk.someapp.domain.repository.WeatherRepository
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val sharedModule = module {

    single {
        HttpClient {
            install(Logging) {
                level = LogLevel.ALL
            }
            install(ContentNegotiation){
                json(Json {
                    ignoreUnknownKeys = true
                })
            }
        }
    }

    singleOf(::WeatherApiImpl) { bind<WeatherApi>() }
    singleOf(::WeatherRepositoryImpl) { bind<WeatherRepository>() }
}