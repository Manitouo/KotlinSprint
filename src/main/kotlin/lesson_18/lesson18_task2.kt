package org.example.lesson_18

import kotlin.random.Random

open class Dice() {
    open fun tossDice() {}
}

class FourthDice(
    private val facesCount: Int = 4,
) : Dice() {
    override fun tossDice() {
        val value = Random.nextInt(1, 4)
        println("У кубика $facesCount граней. Выпало число: $value")
    }
}

class SixthDice(
    private val facesCount: Int = 6,
) : Dice() {
    override fun tossDice() {
        val value = Random.nextInt(1, 6)
        println("У кубика $facesCount граней. Выпало число: $value")
    }
}

class EighthDice(
    private val facesCount: Int = 8,
) : Dice() {
    override fun tossDice() {
        val value = Random.nextInt(1, 8)
        println("У кубика $facesCount граней. Выпало число: $value")
    }
}

fun main() {
    var dicesList: MutableList<Dice> = mutableListOf()

    val dice1: Dice = FourthDice()
    val dice2: Dice = SixthDice()
    val dice3: Dice = EighthDice()

    dicesList.add(dice1)
    dicesList.add(dice2)
    dicesList.add(dice3)

    dicesList.forEach { it.tossDice() }
}