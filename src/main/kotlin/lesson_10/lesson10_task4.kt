package org.example.lesson_10

import kotlin.random.Random

fun main() {
    var victories = 0
    while (true) {
        round(victories)
        print("Хотите бросить кости еще раз? Введите Да или Нет: ")
        if (readln().equals("Нет", ignoreCase = true)) {
            println("Количество ваших побед: $victories")
            break
        }
    }
}

fun dice(): Int = Random.nextInt(1, 6)

fun round(victories: Int): Int {
    val computerTurn = dice()
    println("Очередь машины... Результат: $computerTurn")
    val humanTurn = dice()
    println("Ваша очередь... Результат: $humanTurn")
    when {
        computerTurn < humanTurn -> {
            println("Победило человечество")
            victories++
        }
        computerTurn == humanTurn -> println("Победила дружба")
        else -> println("Победила машина")
    }
    return victories
}
