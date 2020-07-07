package com.example.lesson.entity

/**
 * @author: hs-johnny
 * @date: 2020/7/7
 * @description:
 */
class Lesson {
    enum class State{
        PLAYBACK{
            override fun stateName(): String{
                return "有回放"
            }
        },
        LIVE{
            override fun stateName(): String{
                return "正在直播"
            }
        },
        WAIT{
            override fun stateName(): String{
                return "等待中"
            }
        };
        abstract fun stateName(): String
    }

    var data: String
    var content: String
    var state: State

    constructor(data: String, content: String, state: State){
        this.data = data
        this.content = content
        this.state = state
    }
}