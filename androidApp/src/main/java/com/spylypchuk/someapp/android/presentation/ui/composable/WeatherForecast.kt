package com.spylypchuk.someapp.android.presentation.ui.composable

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.spylypchuk.someapp.android.presentation.ui.state.WeatherState
import com.spylypchuk.someapp.toFormattedString

@Composable
fun WeatherForecast(
    state: WeatherState,
    modifier: Modifier = Modifier
) {
    state.weatherInfo?.weatherDataPerDay?.let { dataMap ->
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            content = {
                items(dataMap.values.toList()) { data ->
                    Column(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                    ) {
                        Text(
                            text = data[0].time.toFormattedString("DD.MM"),
                            fontSize = 20.sp,
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        LazyRow(content = {
                            items(data) { weatherData ->
                                HourlyWeatherDisplay(
                                    weatherData = weatherData,
                                    modifier = Modifier
                                        .height(100.dp)
                                        .padding(horizontal = 16.dp)
                                )
                            }
                        })
                    }
                }
        })

    }
}