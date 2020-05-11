package com.example.daggerex1.car.wheel

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

data class Tire constructor( val pressure:Int){
    private val TAG = "Tire"
    init {
        Log.e(TAG, "$pressure");
    }
}