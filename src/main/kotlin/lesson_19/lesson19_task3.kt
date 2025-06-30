package org.example.lesson_19

import kotlin.random.Random

interface Actions {
    fun flyUp() {}
    fun toLand() {}
    fun bombard() {}
}

class Spaceship (
    val name: String,
    val category: String,
    id: Int = 0,
) : Actions {
    val id = Random.nextInt(0, 50)

    override fun flyUp() {
        println("Корабль взлетел")
    }

    override fun toLand() {
        TODO("Описать приземление корабля")
    }

    override fun bombard() {
        TODO()
    }
}

fun main() {
    val spaceship = Spaceship (
        name = "SuperStar",
        category = "Истребитель",
    )
    spaceship.flyUp()
    spaceship.toLand()
    spaceship.bombard()
}