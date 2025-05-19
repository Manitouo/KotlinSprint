package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("творог", "манка", "сахар", "яйцо", "сметана", "масло")

    for (i in ingredients) {
        print("$i ")
    }

    print("\nКакой продукт заменить?: ")
    val ingredientInArray = readln()
    val index = ingredients.indexOf(ingredientInArray)

    if (index == -1) {
        println("Такого ингредиента нет")
        return
    }
    else {
        print("На какой продукт заменить?: ")
        ingredients[index] = readln()
    }

    for (i in ingredients) {
        print("$i ")
    }
}