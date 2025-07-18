package org.example.lesson_21

fun List<Int>.evenNumbersSum(): Int {
    val filteredList = this.filter {
        it % 2 == 0
    }
    return filteredList.sum()
}

fun main() {
    val number = listOf(1, 2, 3, 4, 5, 6)
    println(number.evenNumbersSum())
}