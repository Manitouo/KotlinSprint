package org.example.lesson_2

fun main() {
    val capitalStart = 70000
    val yearsOfCredit = 20

    val percentageShare = PERCENTAGE_RATE.toDouble() / 100
    val capitalEnd: Double = capitalStart * Math.pow((1 + percentageShare), yearsOfCredit.toDouble())

    println(String.format("%.3f - размер вклада через 20 лет", capitalEnd))
}
const val PERCENTAGE_RATE = 16.7