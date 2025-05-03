package org.example.lesson_4

fun main() {
    val dayScore = 5
    val dayIsEven: Boolean = dayScore % 2 != 0

    println("""
        Упражнения для рук:   ${dayIsEven}
        Упражнения для ног:   ${!dayIsEven}
        Упражнения для спины: ${!dayIsEven}
        Упражнения для пресса:${dayIsEven}
    """.trimIndent())
}