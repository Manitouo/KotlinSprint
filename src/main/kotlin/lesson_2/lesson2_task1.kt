package org.example.lesson_2

fun main() {
    val markOne = 3
    val markTwo = 4
    val markThree = 3
    val markFour = 5
    val pupilCount = 4

    val markSum = markOne + markTwo + markThree + markFour

    val result: Float = markSum.toFloat() / pupilCount

    println(String.format("%.2f", result))
}