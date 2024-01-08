package com.spylypchuk.someapp.android.presentation.ui.mapper

import androidx.annotation.DrawableRes
import com.spylypchuk.someapp.android.R
import com.spylypchuk.someapp.domain.weather.WeatherType

@DrawableRes
fun WeatherType.getDrawableRes(): Int {
    return when (this) {
        is WeatherType.ClearSky -> R.drawable.ic_sunny
        is WeatherType.MainlyClear -> R.drawable.ic_cloudy
        is WeatherType.PartlyCloudy -> R.drawable.ic_cloudy
        is WeatherType.Overcast -> R.drawable.ic_cloudy
        is WeatherType.Foggy -> R.drawable.ic_very_cloudy
        is WeatherType.DepositingRimeFog -> R.drawable.ic_very_cloudy
        is WeatherType.LightDrizzle -> R.drawable.ic_rainshower
        is WeatherType.ModerateDrizzle -> R.drawable.ic_rainshower
        is WeatherType.DenseDrizzle -> R.drawable.ic_rainshower
        is WeatherType.LightFreezingDrizzle -> R.drawable.ic_snowyrainy
        is WeatherType.DenseFreezingDrizzle -> R.drawable.ic_snowyrainy
        is WeatherType.SlightRain -> R.drawable.ic_rainy
        is WeatherType.ModerateRain -> R.drawable.ic_rainy
        is WeatherType.HeavyRain -> R.drawable.ic_rainy
        is WeatherType.HeavyFreezingRain -> R.drawable.ic_snowyrainy
        is WeatherType.SlightSnowFall -> R.drawable.ic_snowy
        is WeatherType.ModerateSnowFall -> R.drawable.ic_heavysnow
        is WeatherType.HeavySnowFall -> R.drawable.ic_heavysnow
        is WeatherType.SnowGrains -> R.drawable.ic_heavysnow
        is WeatherType.SlightRainShowers -> R.drawable.ic_rainshower
        is WeatherType.ModerateRainShowers -> R.drawable.ic_rainshower
        is WeatherType.ViolentRainShowers -> R.drawable.ic_rainshower
        is WeatherType.SlightSnowShowers -> R.drawable.ic_snowy
        is WeatherType.HeavySnowShowers -> R.drawable.ic_snowy
        is WeatherType.ModerateThunderstorm -> R.drawable.ic_thunder
        is WeatherType.SlightHailThunderstorm -> R.drawable.ic_rainythunder
        is WeatherType.HeavyHailThunderstorm -> R.drawable.ic_rainythunder
    }
}