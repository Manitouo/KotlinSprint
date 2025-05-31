package org.example.lesson_10

import kotlin.random.Random

fun main() {
    var victories = 0
    while (true) {
        victories += conductRound()
        print("Хотите бросить кости еще раз? Введите Да или Нет: ")
        if (readln().equals("Нет", ignoreCase = true)) {
            println("Количество ваших побед: $victories")
            break
        }
    }
}

fun throwDice1(): Int = Random.nextInt(1, 6)

fun conductRound(): Int {
    val computerTurn = throwDice1()
    println("Очередь машины... Результат: $computerTurn")
    val humanTurn = throwDice1()
    println("Ваша очередь... Результат: $humanTurn")
    when {
        computerTurn < humanTurn -> {
            println("Победило человечество")
            return 1
        }

        computerTurn == humanTurn -> {
            println("Победила дружба")
            return 0
        }

        else -> {
            println("Победила машина")
            return 0
        }
    }

}
