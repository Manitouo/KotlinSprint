package org.example.lesson_9

fun main() {
    println("Перечислите 5 ингредиентов через запятую")

    val ingredients = readln().split(", ").sorted()

    ingredients.forEach {
        println(it)
    }
}