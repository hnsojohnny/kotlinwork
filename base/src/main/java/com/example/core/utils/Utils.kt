package com.example.core.utils

import android.content.res.Resources
import android.util.TypedValue
import android.widget.Toast
import com.example.core.BaseApplication

/**
 * @author: hs-johnny
 * @date: 2020/7/7
 * @description:
 */
val displayMetrics = Resources.getSystem().getDisplayMetrics()

fun dp2px(dp: Float): Float{
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, displayMetrics)
}

fun toast(string: String, duration: Int){
    Toast.makeText(BaseApplication.currentApplication(), string, duration).show()
}

fun toast(message: String){
    toast(message, Toast.LENGTH_SHORT)
}



