package com.example.core

import android.app.Application
import android.content.Context

/**
 * @author: hs-johnny
 * @date: 2020/7/7
 * @description:
 */
class BaseApplication : Application(){

    companion object{
        lateinit var currentApplication: Context private set
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        currentApplication = this
    }
}