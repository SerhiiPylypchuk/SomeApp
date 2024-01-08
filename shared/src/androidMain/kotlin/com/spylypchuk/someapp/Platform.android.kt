package com.spylypchuk.someapp

import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.toJavaLocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()
actual fun LocalDateTime.toFormattedString(format: String): String
    = DateTimeFormatter
        .ofPattern(format, Locale.getDefault())
        .format(this.toJavaLocalDateTime())