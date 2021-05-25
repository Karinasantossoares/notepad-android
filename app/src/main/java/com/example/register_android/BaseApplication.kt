package com.example.register_android

import android.app.Application
import com.example.register_android.di.notePadModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication :Application() {
    override fun onCreate() {
        super.onCreate()
    startKoin {
        androidContext(this@BaseApplication)
        modules(notePadModules)
    }
    }
}