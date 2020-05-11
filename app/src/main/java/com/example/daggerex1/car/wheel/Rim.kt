package com.example.daggerex1.car.wheel

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class Rim  constructor( val radius:Int){
    private val TAG = "Rim"
    init {
        Log.e(TAG, "$radius");
    }
}
