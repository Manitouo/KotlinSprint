package org.example.lesson_7

fun main() {
    val basicString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
    println("Введите длину пароля (>6): ")
    val maxPasswordLength = readln().toInt()
    var randomPassword = ""

    for (i in 1..maxPasswordLength) {
        randomPassword += basicString.random()
    }

    println(randomPassword)
}
