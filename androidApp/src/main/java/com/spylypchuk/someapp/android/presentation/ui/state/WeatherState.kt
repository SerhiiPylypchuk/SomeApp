package com.spylypchuk.someapp.android.presentation.ui.state

import com.spylypchuk.someapp.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
