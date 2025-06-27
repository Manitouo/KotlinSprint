package org.example.lesson_18

import kotlin.random.Random

open class Dice() {
    open val facesCount: Int = 0

    open fun tossDice() {
        val value = Random.nextInt(1, facesCount)
        println("У кубика $facesCount граней. Выпало число: $value")
    }
}

class FourthDice() : Dice() {
    override val facesCount: Int = 4
}

class SixthDice(): Dice() {
    override val facesCount: Int = 6
}

class EighthDice(): Dice() {
    override val facesCount: Int = 8
}

fun main() {
    val dicesList: MutableList<Dice> = mutableListOf()

    val dice1: Dice = FourthDice()
    val dice2: Dice = SixthDice()
    val dice3: Dice = EighthDice()

    dicesList.add(dice1)
    dicesList.add(dice2)
    dicesList.add(dice3)

    dicesList.forEach { it.tossDice() }
}