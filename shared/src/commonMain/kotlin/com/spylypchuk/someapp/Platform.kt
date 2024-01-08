package com.spylypchuk.someapp

import kotlinx.datetime.LocalDateTime

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
expect fun LocalDateTime.toFormattedString(format: String): String