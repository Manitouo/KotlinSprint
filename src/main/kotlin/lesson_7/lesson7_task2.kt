package org.example.lesson_7

fun main() {
    val numberRange = 1000..9999

    while (true) {
        val randomNumber = numberRange.random()
        println("Ваш код авторизации: $randomNumber\nВведите код авторизации: ")
        if (readln().toInt() == randomNumber) {
            println("Код введен верно!")
            break
        }
    }

}