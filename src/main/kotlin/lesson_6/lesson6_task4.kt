package org.example.lesson_6

import kotlin.random.Random

fun main() {
    val number = Random.nextInt(1, 9)
    println(number)

    var attempt = 5
    var answer: Int

    while (attempt > 0) {
        println("Введите число: ")
        answer = readln().toInt()
        if (answer == number) {
            println("Это была великолепная игра!")
            return
        }
        else println("Неверно!\nОсталось попыток: ${--attempt}")
    }

    println("Было загадано число $number")
}