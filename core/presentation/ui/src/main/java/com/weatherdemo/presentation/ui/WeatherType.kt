package com.weatherdemo.presentation.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.core.presentation.designsystems.CloudyIcon
import com.core.presentation.designsystems.HeavySnowIcon
import com.core.presentation.designsystems.RainShowerIcon
import com.core.presentation.designsystems.RainyIcon
import com.core.presentation.designsystems.RainyThunderIcon
import com.core.presentation.designsystems.SnowyIcon
import com.core.presentation.designsystems.SnowyRainyIcon
import com.core.presentation.designsystems.SunnyIcon
import com.core.presentation.designsystems.ThunderIcon
import com.core.presentation.designsystems.VeryCloudyIcon

sealed class WeatherType(
    val weatherDesc: String,
    val iconRes: @Composable () -> ImageVector
) {
    data object ClearSky : WeatherType(
        weatherDesc = "Clear sky",
        iconRes = { SunnyIcon }
    )
    data object MainlyClear : WeatherType(
        weatherDesc = "Mainly clear",
        iconRes = { CloudyIcon }
    )
    data object PartlyCloudy : WeatherType(
        weatherDesc = "Partly cloudy",
        iconRes = { CloudyIcon }
    )
    data object Overcast : WeatherType(
        weatherDesc = "Overcast",
        iconRes = { CloudyIcon }
    )
    data object Foggy : WeatherType(
        weatherDesc = "Foggy",
        iconRes = { VeryCloudyIcon }
    )
    data object DepositingRimeFog : WeatherType(
        weatherDesc = "Depositing rime fog",
        iconRes = { VeryCloudyIcon }
    )
    data object LightDrizzle : WeatherType(
        weatherDesc = "Light drizzle",
        iconRes = { RainShowerIcon }
    )
    data object ModerateDrizzle : WeatherType(
        weatherDesc = "Moderate drizzle",
        iconRes = { RainShowerIcon }
    )
    data object DenseDrizzle : WeatherType(
        weatherDesc = "Dense drizzle",
        iconRes = { RainShowerIcon }
    )
    data object LightFreezingDrizzle : WeatherType(
        weatherDesc = "Slight freezing drizzle",
        iconRes = { SnowyRainyIcon }
    )
    data object DenseFreezingDrizzle : WeatherType(
        weatherDesc = "Dense freezing drizzle",
        iconRes = { SnowyRainyIcon }
    )
    data object SlightRain : WeatherType(
        weatherDesc = "Slight rain",
        iconRes = { RainyIcon }
    )
    data object ModerateRain : WeatherType(
        weatherDesc = "Rainy",
        iconRes = { RainyIcon }
    )
    data object HeavyRain : WeatherType(
        weatherDesc = "Heavy rain",
        iconRes = { RainyIcon }
    )
    data object HeavyFreezingRain: WeatherType(
        weatherDesc = "Heavy freezing rain",
        iconRes = { SnowyRainyIcon }
    )
    data object SlightSnowFall: WeatherType(
        weatherDesc = "Slight snow fall",
        iconRes = { SnowyIcon }
    )
    data object ModerateSnowFall: WeatherType(
        weatherDesc = "Moderate snow fall",
        iconRes = { HeavySnowIcon }
    )
    data object HeavySnowFall: WeatherType(
        weatherDesc = "Heavy snow fall",
        iconRes = { HeavySnowIcon }
    )
    data object SnowGrains: WeatherType(
        weatherDesc = "Snow grains",
        iconRes = { HeavySnowIcon }
    )
    data object SlightRainShowers: WeatherType(
        weatherDesc = "Slight rain showers",
        iconRes = { RainShowerIcon }
    )
    data object ModerateRainShowers: WeatherType(
        weatherDesc = "Moderate rain showers",
        iconRes = { RainShowerIcon }
    )
    data object ViolentRainShowers: WeatherType(
        weatherDesc = "Violent rain showers",
        iconRes = { RainShowerIcon }
    )
    data object SlightSnowShowers: WeatherType(
        weatherDesc = "Light snow showers",
        iconRes = { SnowyIcon }
    )
    data object HeavySnowShowers: WeatherType(
        weatherDesc = "Heavy snow showers",
        iconRes = { SnowyIcon }
    )
    data object ModerateThunderstorm: WeatherType(
        weatherDesc = "Moderate thunderstorm",
        iconRes = { ThunderIcon }
    )
    data object SlightHailThunderstorm: WeatherType(
        weatherDesc = "Thunderstorm with slight hail",
        iconRes = { RainyThunderIcon }
    )
    data object HeavyHailThunderstorm: WeatherType(
        weatherDesc = "Thunderstorm with heavy hail",
        iconRes = { RainyThunderIcon }
    )
}