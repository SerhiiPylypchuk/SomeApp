package com.spylypchuk.someapp.android

import android.app.Application
import com.spylypchuk.someapp.di.SharedModule
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SomeAppApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        SharedModule.init(this)
    }
}