package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("творог", "манка", "сахар", "яйцо", "сметана", "масло")

    for (i in ingredients) {
        print("$i ")
    }

    print("\nКакой продукт заменить?: ")
    val ingredientInArray = readln()

    if (ingredients.contains(ingredientInArray)) {
        print("На какой продукт заменить?: ")
        val index = ingredients.indexOf(ingredientInArray)
        ingredients[index] = readln()
    }
    else {
        println("Такого ингредиента нет")
        return
    }

    for (i in ingredients) {
        print("$i ")
    }
}