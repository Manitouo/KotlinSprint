package org.example.lesson_6

import kotlin.random.Random

fun main() {
    var number1: Int
    var number2: Int
    var attempt = 3
    var answer: Int

    while (attempt > 0) {
        number1 = Random.nextInt(1, 9)
        number2 = Random.nextInt(1, 9)
        println("Сколько будет $number1 + $number2: ")
        answer = readln().toInt()
        if (answer == number1 + number2) {
            println("Добро пожаловать!")
            return
        }
        else {
            println("Неверно!")
            attempt--
        }

    }
    println("Доступ запрещен!")
}