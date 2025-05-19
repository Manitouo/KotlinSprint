package org.example.lesson_8

fun main() {
    val viewsArray = arrayOf(24, 13, 51, 12, 41, 11, 16)
    var viewsCount = 0

    for (i in viewsArray){
        viewsCount += i
    }

    println("Количество просмотров за неделю: $viewsCount")
}