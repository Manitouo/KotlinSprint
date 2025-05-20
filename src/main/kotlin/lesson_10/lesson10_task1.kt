package org.example.lesson_10

import kotlin.random.Random

fun main() {
    val computerTurn = throwDice()
    println("Очередь машины... Результат: $computerTurn")
    val humanTurn = throwDice()
    println("Ваша очередь... Результат: $humanTurn")
    compareResult(computerTurn, humanTurn)
}

fun throwDice() : Int = Random.nextInt(1, 6)

fun compareResult(computerTurn: Int, humanTurn: Int) {
    when {
        computerTurn < humanTurn -> print ("Победило человечество")
        computerTurn == humanTurn -> print ("Победила дружба")
        else -> print ("Победила машина")
    }
}