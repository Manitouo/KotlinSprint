package org.example.lesson_2

fun main() {
    val hourStart: Int = 9
    val minuteStart: Int = 39
    val minuteWay: Int = 457

    val minuteCountEnd: Int = hourStart * 60 + minuteStart + minuteWay

    val hourEnd: Int = minuteCountEnd / 60
    val minuteEnd: Int = minuteCountEnd % 60

    println(String.format("%d:%d", hourEnd, minuteEnd))
}