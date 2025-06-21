package org.example.lesson_16

import kotlin.random.Random

class Cube() {
    private val number = Random.nextInt(1, 6)

    fun printNumber() {
        println("Выпавшее число: $number")
    }
}

fun main() {
    val nextNumber1 = Cube()

    nextNumber1.printNumber()
}