package org.example.lesson_7

fun main() {
    val basicString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
    val capitalLetterRange = 'A'..'Z'
    val smallLetterRange = 'a'..'z'
    val numberRange = 0..9
    println("Введите длину пароля (>6): ")
    val maxPasswordLength = readln().toInt()
    var randomPassword = mutableListOf("")

    randomPassword.add(capitalLetterRange.random().toString())
    randomPassword.add(smallLetterRange.random().toString())
    randomPassword.add(numberRange.random().toString())

    for (i in 4..maxPasswordLength) {
        randomPassword.add(basicString.random().toString())
    }
    randomPassword.shuffle()
    for (i in randomPassword){
        print(i)
    }
}
