package org.example.lesson_9

fun main() {
    var ingredientsList = mutableListOf("помидор", "огурец", "лук")
    print("В рецепте есть базовые ингредиенты: ")
    ingredientsList.forEach { print("$it ") }
    print("\nЖелаете добавить еще?: ")
    val answer = readln()
    if (answer.equals("да", ignoreCase = true)) {
        print("Какой ингредиент вы хотите добавить?: ")
        ingredientsList.add(readln())
        print("Теперь в рецепте есть следующие ингредиенты: ")
        ingredientsList.forEach { print("$it ") }
    }
    else return
}