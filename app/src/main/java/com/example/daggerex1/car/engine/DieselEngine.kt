package com.example.daggerex1.car.engine

import android.util.Log

class DieselEngine  : Engine{
    private val TAG = "Diesel"
    override fun start() {
        Log.e(TAG, "start");
    }
}