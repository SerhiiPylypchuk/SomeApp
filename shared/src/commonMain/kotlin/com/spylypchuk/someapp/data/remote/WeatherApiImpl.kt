package com.spylypchuk.someapp.data.remote

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class WeatherApiImpl(private val client: HttpClient): WeatherApi {
    override suspend fun getWeatherData(lat: Double, long: Double): WeatherDto {
        return client
            .get("https://api.open-meteo.com/v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl") {
                url {
                    parameters.append("latitude", lat.toString())
                    parameters.append("longitude", long.toString())
                }
            }
            .body()
    }
}