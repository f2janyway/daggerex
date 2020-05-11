package com.example.daggerex1.car

import com.example.daggerex1.MainActivity
import com.example.daggerex1.di.ActivityScope
import com.example.daggerex1.di.ApplicationComponent
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named
import javax.inject.Singleton

@ActivityScope
@Subcomponent(modules = [CarModule::class])
interface CarComponent {

    fun inject(m: MainActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @Named("radius")radius: Int,
            @BindsInstance @Named("pressure")pressure: Int
        ): CarComponent
    }

}