package org.example.lesson_4

fun main() {
    val reservationToday = 13
    val reservationTomorrow = 9

    println("Доступность столиков на сегодня: ${reservationToday < TABLES_COUNT}\n" +
            "Доступность столиков на завтра: ${reservationTomorrow < TABLES_COUNT}\n")


}

const val TABLES_COUNT = 13