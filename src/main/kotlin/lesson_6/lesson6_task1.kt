package org.example.lesson_6

fun main() {
    println("Придумайте логин: ")
    val login = readln()
    println("Придумайте пароль: ")
    val password = readln()

    var isRegistered = false

    while (!isRegistered) {
        println("Введите логин: ")
        if (readln() == login) {
            println("Введите пароль: ")
            if (readln() == password) {
                println("Авторизация прошла успешно")
                isRegistered = true
            }
        }
    }
}