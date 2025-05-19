package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("творог", "манка", "сахар", "яйцо", "сметана", "масло")
    println("Какой продукт найти?: ")
    val searchIngredient = readln()

    for (i in ingredients) {
        if (searchIngredient == i) {
            println("Ингредиент $i в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")
}