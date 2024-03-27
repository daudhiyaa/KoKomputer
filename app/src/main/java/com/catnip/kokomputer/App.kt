package com.catnip.kokomputer

import android.app.Application
import com.catnip.kokomputer.data.source.local.database.AppDatabase

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AppDatabase.getInstance(this)
    }
}