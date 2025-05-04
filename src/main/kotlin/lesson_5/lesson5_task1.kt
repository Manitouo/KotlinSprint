package org.example.lesson_5

fun main() {
    print("Сколько будет 2 + 2? Введите ответ: ")
    val answer = readln()

    if (answer.toInt() == 4) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}