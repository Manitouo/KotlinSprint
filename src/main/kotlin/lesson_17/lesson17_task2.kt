package org.example.lesson_17

class Ship(
    name: String,
    var speed: Double,
    var seaport: String,
) {
    var name = name
        set(value) {
            println("Менять имя нельзя!")
        }
}

fun main() {
    val ship1 = Ship(
        name = "Ледокол",
        speed = 3224.5,
        seaport = "Порт-Юг",
    )

    println("${ship1.name}, ${ship1.speed}, ${ship1.seaport}")
    ship1.name = "Туристический"
    println("${ship1.name}, ${ship1.speed}, ${ship1.seaport}")
}