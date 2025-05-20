package org.example.lesson_10

import kotlin.random.Random

fun main() {
    val computerTurn = dice()
    println("Очередь машины... Результат: $computerTurn")
    val humanTurn = dice()
    println("Ваша очередь... Результат: $humanTurn")
    comparison(computerTurn, humanTurn)
}

fun dice() : Int = Random.nextInt(1, 6)

fun comparison(computerTurn: Int, humanTurn: Int) {
    when {
        computerTurn < humanTurn -> print ("Победило человечество")
        computerTurn == humanTurn -> print ("Победила дружба")
        else -> print ("Победила машина")
    }
}