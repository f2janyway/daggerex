package com.example.daggerex1.car

import com.example.daggerex1.car.engine.DieselEngine
import com.example.daggerex1.car.wheel.Rim
import com.example.daggerex1.car.wheel.Tire
import com.example.daggerex1.car.wheel.Wheel
import com.example.daggerex1.di.ActivityScope
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class CarModule {
    @Provides
    fun provideCar(wheel: Wheel,dieselEngine: DieselEngine) = Car(wheel,dieselEngine)

    @Provides
    fun provideWheel(rim: Rim, tire: Tire) = Wheel(rim,tire)

    @Provides
    fun provideRim(@Named("radius") radius:Int) = Rim(radius)

    @Provides
    fun provideTire(@Named("pressure") pressure:Int) = Tire(pressure)

    @Provides
    fun provideEngine() = DieselEngine()
}