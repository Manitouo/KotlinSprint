package org.example.lesson_2

fun main() {
    val capitalStart = 70000
    val yearsOfCredit = 20

    val capitalEnd: Double = capitalStart * Math.pow((1 + PERCENTAGE_RATE), yearsOfCredit.toDouble())

    println(String.format("%.3f - размер вклада через 20 лет", capitalEnd))
}
const val PERCENTAGE_RATE = 0.167