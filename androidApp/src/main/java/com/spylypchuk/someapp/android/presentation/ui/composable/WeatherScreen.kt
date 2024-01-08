package com.spylypchuk.someapp.android.presentation.ui.composable

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.spylypchuk.someapp.android.presentation.ui.state.WeatherState
import com.spylypchuk.someapp.android.presentation.ui.theme.DeepBlue

@Composable
fun WeatherScreen(
    state: WeatherState,
    modifier: Modifier = Modifier
) {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_PORTRAIT -> {
            Column(
                modifier = modifier
            ) {
                WeatherCard(
                    state = state,
                    backgroundColor = DeepBlue
                )
                Spacer(modifier = Modifier.height(16.dp))
                WeatherForecast(state = state)
            }
        }
        else -> {
            Row (
                modifier = modifier
            ) {
                WeatherCard(
                    state = state,
                    backgroundColor = DeepBlue,
                    modifier = Modifier.fillMaxWidth(0.5f)
                )
                Spacer(modifier = Modifier.width(16.dp))
                WeatherForecast(state = state)
            }
        }
    }
}