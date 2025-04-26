package org.example.lesson_2

fun main() {
    val permanentEmployee: Int = 50
    val permanentPay: Int = 30000
    val internEmployee: Int = 30
    val internPay: Int = 20000

    val permanentPayout: Int = permanentEmployee * permanentPay
    val generalPayout: Int = permanentPayout + (internEmployee * internPay)
    val averagePayout: Int = (permanentPay + internPay) / (permanentEmployee + internEmployee)

    println(permanentPayout)
    println(generalPayout)
    println(averagePayout)
}