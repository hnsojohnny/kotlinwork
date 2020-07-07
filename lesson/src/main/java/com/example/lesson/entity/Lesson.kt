package com.example.lesson.entity

/**
 * @author: hs-johnny
 * @date: 2020/7/7
 * @description:
 */
class Lesson {
    enum class State{
        PLAYBACK{
            fun stateName(): String{
                return "有回放"
            }
        },
        LIVE{
            fun stateName(): String{
                return "正在直播"
            }
        },
        WAIT{
            fun stateName(): String{
                return "等待中"
            }
        };
        fun stateName(): String
    }

    private var data: String? = null
    private var content: String? = null
    private var state: State? = null

    constructor(data: String, content: String, state: State){
        this.data = data
        this.content = content
        this.state = state
    }
}