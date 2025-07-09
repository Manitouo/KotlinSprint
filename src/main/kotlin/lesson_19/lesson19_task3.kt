package org.example.lesson_19

interface Actions {
    fun flyUp() {}
    fun toLand() {}
    fun bombard() {}
}

class Spaceship(
    val name: String,
    val category: String,
    id: Int = 0,
) : Actions {
    val id = (0..50).random()

    override fun flyUp() {
        println("Корабль взлетел")
    }

    override fun toLand() {
        TODO("Описать приземление корабля")
    }

    override fun bombard() {
        //TODO Необходима дополнительная логика
    }
}

fun main() {
    val spaceship = Spaceship(
        name = "SuperStar",
        category = "Истребитель",
    )
    spaceship.flyUp()
    spaceship.toLand()
    spaceship.bombard()
}