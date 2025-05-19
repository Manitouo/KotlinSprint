package org.example.lesson_9

fun main() {
    val ingredients = mutableSetOf<String>()
    println("Введите 5 ингредиентов: ")
    for (i in 1..5) {
        ingredients.add(readln())
    }

    println(ingredients.sorted().joinToString(", ").replaceFirstChar {
        if (it.isLowerCase()) it.titlecase() else it.toString()
    })
}