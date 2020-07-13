package com.example.core

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * @author: hs-johnny
 * @date: 2020/7/7
 * @description:
 */
abstract class BaseViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView){

    val viewHashMap = hashMapOf<Int, View>()

    fun <T : View> getView(id: Int): T{
        var view = viewHashMap[id]
        if (view == null){
            view = itemView.findViewById(id)
            viewHashMap[id] = view
        }
        return view as T
    }

    fun setText(id: Int, text: String){
        (getView<View>(id) as TextView).text = text
    }
}