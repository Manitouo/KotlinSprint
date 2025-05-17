package org.example.lesson_7

fun main() {
    println("Введите количество секунд: ")
    val seconds = readln().toInt()

    for (i in seconds downTo 0){
        println("Осталось секунд: $i")
        Thread.sleep(1000)
    }

    println("Время вышло")
}