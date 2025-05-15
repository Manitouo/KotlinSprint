package org.example.lesson_6

fun main() {
    println("Сколько секунд отсчитать?")
    val seconds = readln().toLong()
    val milliseconds = seconds * 1000

    Thread.sleep(milliseconds)

    println("Прошло секунд: $seconds")
}