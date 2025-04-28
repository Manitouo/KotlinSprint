package org.example.lesson_1

fun main() {
    val seconds: Short = 6480
    val twoStepsOfTime: Int = STEP_OF_TIME * STEP_OF_TIME
    val hours: Int = seconds / twoStepsOfTime
    val hoursRest: Int = seconds % twoStepsOfTime
    val minutes: Int = hoursRest / STEP_OF_TIME
    val sec: Int = seconds % STEP_OF_TIME

    println(String.format("%02d:%02d:%02d", hours, minutes, sec))
}

const val STEP_OF_TIME: Int = 60