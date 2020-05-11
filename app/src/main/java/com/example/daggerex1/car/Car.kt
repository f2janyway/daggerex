package com.example.daggerex1.car

import com.example.daggerex1.car.engine.Engine
import com.example.daggerex1.car.wheel.Wheel
import javax.inject.Inject
import javax.inject.Named

data class Car @Inject constructor(val wheel : Wheel, val engine: Engine)