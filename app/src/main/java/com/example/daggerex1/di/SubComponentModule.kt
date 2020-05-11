package com.example.daggerex1.di

import com.example.daggerex1.car.CarComponent
import dagger.Module

@Module(subcomponents = [CarComponent::class])
class SubComponentModule