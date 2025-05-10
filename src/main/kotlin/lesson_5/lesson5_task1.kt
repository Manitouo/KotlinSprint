package org.example.lesson_5

fun main() {
    val number1 = 2
    val number2 = 2
    print("Сколько будет $number1 + $number2? Введите ответ: ")
    val answer = readln()

    if (answer.toInt() == (number1 + number2)) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}