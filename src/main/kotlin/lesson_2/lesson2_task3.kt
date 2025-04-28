package org.example.lesson_2

fun main() {
    val hourStart: Int = 9
    val minuteStart: Int = 39
    val minuteWay: Int = 457

    val minuteCountEnd: Int = hourStart * STEP_OF_TIME + minuteStart + minuteWay

    val hourEnd: Int = minuteCountEnd / STEP_OF_TIME
    val minuteEnd: Int = minuteCountEnd % STEP_OF_TIME

    println(String.format("%d:%d", hourEnd, minuteEnd))
}

const val STEP_OF_TIME = 60