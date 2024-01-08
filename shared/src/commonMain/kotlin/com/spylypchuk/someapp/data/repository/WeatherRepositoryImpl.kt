package com.spylypchuk.someapp.data.repository

import com.spylypchuk.someapp.data.mappers.toWeatherInfo
import com.spylypchuk.someapp.data.remote.WeatherApi
import com.spylypchuk.someapp.domain.repository.WeatherRepository
import com.spylypchuk.someapp.domain.util.Resource
import com.spylypchuk.someapp.domain.weather.WeatherInfo

class WeatherRepositoryImpl constructor(
    private val api: WeatherApi
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch(e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}