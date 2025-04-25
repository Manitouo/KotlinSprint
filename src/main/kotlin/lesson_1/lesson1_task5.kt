package org.example.lesson_1

fun main() {
    val seconds: Short = 6480
    val hours: Int = seconds / 3600
    val hoursRest: Int = seconds % 3600
    val minutes: Int = hoursRest / 60
    val sec: Int = seconds % 60

    println(String.format("%02d:%02d:%02d", hours, minutes, sec))
}