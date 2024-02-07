package com.example.mvvmwithretrofitwithflow

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
public class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
    }
}