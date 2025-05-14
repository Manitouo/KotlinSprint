package org.example.lesson_6

fun main() {
    println("Сколько секунд отсчитать?")
    var seconds = readln().toInt()
    val secondsToPrint = seconds

    while (seconds > 0) {
        seconds--
        Thread.sleep(1000)
    }

    println("Прошло $secondsToPrint секунд")
}