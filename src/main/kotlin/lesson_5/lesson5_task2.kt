package org.example.lesson_5

fun main() {
    print("Год рождения: ")
    val yearOfBirth = readln().toInt()

    if (CURRENT_YEAR - yearOfBirth >= AGE_OF_MAJORITY) print("Show limited content")
    else print("Back to main screen")
}

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2025