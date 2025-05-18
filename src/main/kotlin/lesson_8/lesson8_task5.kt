package org.example.lesson_8

fun main() {
    print("Сколько ингредиентов в блюде?: ")
    val numberOfIngredients = readln().toInt()
    var ingredientsArray = arrayOfNulls<String>(numberOfIngredients)

    println("Введите ингредиенты, которые нужно добавить")
    for (i in 0..numberOfIngredients - 1) {
        print("Ингредиент ${i + 1}: ")
        ingredientsArray[i] = readln()
    }

    for (i in ingredientsArray.indices) {
        if (i < ingredientsArray.lastIndex) print("${ingredientsArray[i]}, ")
        else println(ingredientsArray[i])
    }
}