package org.example.lesson_9

fun main() {
    val ingredientsPerServing = listOf(2, 50, 15)
    print("Сколько порций?: ")
    val portionCount = readln().toInt()
    val newIngredientsList = ingredientsPerServing.map {
        it * portionCount
    }
    println("На $portionCount порций вам понадобится: Яиц - ${newIngredientsList[0]}, молока - ${newIngredientsList[1]}" +
            ", сливочного масла - ${newIngredientsList[2]}")
}