package org.example.lesson_4

fun main() {
    val dayScore = 5
    val dayIsUneven: Boolean = dayScore % 2 == 0

    println("""
        Упражнения для рук:   ${!dayIsUneven}
        Упражнения для ног:   ${dayIsUneven}
        Упражнения для спины: ${dayIsUneven}
        Упражнения для пресса:${!dayIsUneven}
    """.trimIndent())
}