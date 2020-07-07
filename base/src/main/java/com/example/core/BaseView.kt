package com.example.core

/**
 * @author: hs-johnny
 * @date: 2020/7/7
 * @description:
 */
interface BaseView<T> {
    fun getPresenter(): T
}