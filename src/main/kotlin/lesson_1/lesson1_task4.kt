package org.example.lesson_1

fun main() {
    val length: Long = 40868600000L
    val age: Byte = 27
    val partOfDay: Float = 0.075F
    val seconds: Short = 6480
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: Int = 327000

    println("$length мм пролетел Гагарин пока был в космосе\n" +
            "$age лет - возраст Гагарина на момент полета\n" +
            "${partOfDay}ую часть дня Гагарин провел в космосе\n" +
            "$seconds сек Гагарин провел в космосе\n" +
            "$partOfYear часть года Гагарин провел в космосе\n" +
            "$apogee м - апогей орбиты Гагарина")
}