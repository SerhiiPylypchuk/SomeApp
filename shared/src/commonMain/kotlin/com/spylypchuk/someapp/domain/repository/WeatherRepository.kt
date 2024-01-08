package com.spylypchuk.someapp.domain.repository

import com.spylypchuk.someapp.domain.util.Resource
import com.spylypchuk.someapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}