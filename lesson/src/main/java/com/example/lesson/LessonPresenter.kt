package com.example.lesson

import com.example.core.http.EntityCallback
import com.example.core.http.HttpClient
import com.example.core.utils.toast
import com.example.lesson.entity.Lesson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

class LessonPresenter {
    companion object{
        const val LESSON_PATH = "lessons"
    }
    private var activity: LessonActivity? = null

    constructor(activity: LessonActivity){
        this.activity = activity
    }

    private var lessons: List<Lesson> = ArrayList()

    val type: Type = object : TypeToken<List<Lesson>>(){}.type

    fun fetchData(){
        HttpClient.get(LESSON_PATH, type, object : EntityCallback<List<Lesson>>{
            override fun onSuccess(entity: List<Lesson>) {
                this@LessonPresenter.lessons = entity
                activity?.runOnUiThread {
                    activity?.showResult(lessons)
                }
            }

            override fun onFailure(message: String?) {
                activity?.runOnUiThread { toast(message) }
            }
        })
    }

    fun showPlayback(){
        var playbackLessons = ArrayList<Lesson>()
        for (lesson in playbackLessons){
            playbackLessons.add(lesson)
        }
        activity?.showResult(playbackLessons)
    }
}