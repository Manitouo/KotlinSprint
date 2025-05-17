package org.example.lesson_7

fun main() {
    val numberRange = 0..9
    val letterRange = 'a'..'z'
    var password = ""

    for (i in 1..6) {
        if (i % 2 == 0) password += numberRange.random()
        else password += letterRange.random()
    }

    println(password)
}