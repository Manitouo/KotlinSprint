package org.example.lesson_9

fun main() {
    val ingredientsList = listOf("сахар", "соль", "манка", "масло", "сметана", "яйцо")
    println("В рецепте есть следующие ингредиенты:")
    ingredientsList.forEach {
        println(it)
    }
}