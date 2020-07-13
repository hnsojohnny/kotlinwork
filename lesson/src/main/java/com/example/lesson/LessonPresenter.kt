package com.example.lesson

import com.example.core.http.EntityCallback
import com.example.core.http.HttpClient
import com.example.core.utils.toast
import com.example.lesson.entity.Lesson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

class LessonPresenter constructor(var activity: LessonActivity?){
    companion object{
        const val LESSON_PATH = "lessons"
    }
    private var lessons: List<Lesson> = ArrayList()

    private val type: Type = object : TypeToken<List<Lesson>>(){}.type

    fun fetchData(action: (lessons: List<Lesson>) -> Unit){
        HttpClient.get(LESSON_PATH, type, object : EntityCallback<List<Lesson>>{
            override fun onSuccess(entity: List<Lesson>) {
                this@LessonPresenter.lessons = entity
                activity?.runOnUiThread {
                    action(lessons)
                }
            }

            override fun onFailure(message: String?) {
                activity?.runOnUiThread { toast(message) }
            }
        })
    }

        fun showPlayback(action: (lessons: List<Lesson>) -> Unit){
        var playbackLessons = lessons.filter { it.state == Lesson.State.PLAYBACK }
        action(playbackLessons)
    }

}