package com.spylypchuk.someapp.domain.location

import com.spylypchuk.someapp.data.location.GpsData

interface LocationTracker {
    suspend fun getCurrentLocation(): GpsData?
}