package com.example.core.http

import androidx.annotation.NonNull

/**
 * @author: hs-johnny
 * @date: 2020/7/7
 * @description:
 */
interface EntityCallback<T> {
    fun onSuccess(entity: T)
    fun onFailure(message: String?)
}