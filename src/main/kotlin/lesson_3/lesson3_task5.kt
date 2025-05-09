package org.example.lesson_3

fun main() {
    val string = "E2-E4;0"

    val separatedString = string.split('-', ';')

    val value1 = separatedString[0]
    val value2 = separatedString[1]
    val value3 = separatedString[2]

    print("$value1\n$value2\n$value3")
}