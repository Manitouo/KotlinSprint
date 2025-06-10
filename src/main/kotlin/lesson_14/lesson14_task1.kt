package org.example.lesson_14

open class Liner(
    val name: String,
    val speed: Int,
    val loadCapacity: Int,
    var canCrackIce: Boolean = false,
)

class Icebreaker(
    name: String,
    speed: Int,
    loadCapacity: Int,
) : Liner(name, speed, loadCapacity, canCrackIce = true)

class CargoShip(
    name: String,
    speed: Int,
    loadCapacity: Int,
) : Liner(name, speed, loadCapacity)

fun main() {

    val ship1 = Liner("Лайнер", 22, 3000)
    val ship2 = Icebreaker("Ледокол", 20, 7540)
    val ship3 = CargoShip("Грузовой", 22, 83000)


    println("${ship1.name}\n${ship1.speed}\n${ship1.loadCapacity}\n${ship1.canCrackIce}\n")
    println("${ship2.name}\n${ship2.speed}\n${ship2.loadCapacity}\n${ship2.canCrackIce}\n")
    println("${ship3.name}\n${ship3.speed}\n${ship3.loadCapacity}\n${ship3.canCrackIce}\n")

}