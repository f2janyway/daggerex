package com.example.daggerex1

import android.app.Application
import android.content.SharedPreferences
import android.content.res.Configuration
import com.example.daggerex1.car.CarModule
import com.example.daggerex1.di.ApplicationComponent
import com.example.daggerex1.di.ApplicationModule
import com.example.daggerex1.di.DaggerApplicationComponent
import dagger.internal.DaggerCollections
import javax.inject.Inject

class MyApplication : Application() {
    private val mComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder()
            .myApplication(this)
            .build()
    }

    @Inject
    lateinit var pref: SharedPreferences
    override fun onCreate() {
        super.onCreate()
        this.getComponent().inject(this)
        pref.edit().putString("0", "hi").apply()
    }

    fun getComponent(): ApplicationComponent = mComponent
}