package com.example.daggerex1

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.daggerex1.car.Car
import com.example.daggerex1.car.CarComponent
import com.example.daggerex1.di.ApplicationComponent
import com.example.daggerex1.di.DaggerApplicationComponent
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mSharedPrefs: SharedPreferences


    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car


    val carComponent: CarComponent by lazy {
        (application as MyApplication).getComponent().carComponent().create(100,1)
    }
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        carComponent.inject(this)

        setContentView(R.layout.activity_main)

        Log.e(TAG, "$car1");
        Log.e(TAG, "$car2");
        main_textview.text = mSharedPrefs.getString("0", "null")

    }
}
