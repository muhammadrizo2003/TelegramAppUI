package com.example.telegramuiclone

import android.app.Application
import android.util.Log

class TelegramApplication : Application() {
    private val TAG: String = TelegramApplication::class.java.simpleName.toString()
    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate: ")
    }
}
