package com.spylypchuk.someapp.data.remote

interface WeatherApi {
    suspend fun getWeatherData(
        lat: Double,
        long: Double
    ): WeatherDto
}