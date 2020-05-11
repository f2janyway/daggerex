package com.example.daggerex1.di

import com.example.daggerex1.MainActivity
import com.example.daggerex1.MyApplication
import com.example.daggerex1.car.CarComponent
import com.example.daggerex1.car.CarModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class,SubComponentModule::class])
interface ApplicationComponent{

    fun inject(ap: MyApplication)

    fun carComponent():CarComponent.Factory


    @Component.Builder
    interface Builder{

        @BindsInstance
        fun myApplication(myApplication: MyApplication):Builder

        fun build():ApplicationComponent

    }
}