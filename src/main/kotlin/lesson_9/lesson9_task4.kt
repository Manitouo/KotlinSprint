package org.example.lesson_9

fun main() {
    println("Перечислите 5 ингредиентов через запятую")
    val ingredientsList = mutableListOf<String>()
    val ingredients = readln().split(", ")
    ingredients.forEach {
        ingredientsList.add(it)
    }
    ingredientsList.sort()
    ingredientsList.forEach {
        println(it)
    }
}