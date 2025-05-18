package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("творог", "манка", "сахар", "яйцо", "сметана", "масло")
    println("Какой продукт найти?: ")
    val searchIngredient = readln()

    if (ingredients.contains(searchIngredient)) println("Ингредиент $searchIngredient в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}