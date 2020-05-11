package com.example.daggerex1.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import com.example.daggerex1.MyApplication
import com.example.daggerex1.car.CarComponent
import dagger.Module

import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

@Module
class ApplicationModule  {
    @Singleton
    @Provides
    fun provideSharedPref(myApp:MyApplication): SharedPreferences =
        PreferenceManager.getDefaultSharedPreferences(myApp)
}