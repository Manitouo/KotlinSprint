package org.example.lesson_14

open class Liner(
    val name: String,
    val speed: Int = 22,
    val loadCapacity: Int = 3000,
)

class Icebreaker(
    name: String,
    var canCrackIce: Boolean = true,
) : Liner(name, speed = 20, loadCapacity = 7540)

class CargoShip(
    name: String,
) : Liner(name, speed = 22, loadCapacity = 83000)

fun main() {

    val ship1 = Liner("Лайнер")
    val ship2 = Icebreaker("Ледокол")
    val ship3 = CargoShip("Грузовой")
    println("${ship1.name}\n${ship1.speed}\n${ship1.loadCapacity}\n")
    println("${ship2.name}\n${ship2.speed}\n${ship2.loadCapacity}\nМожет разбивать лед: ${ship2.canCrackIce}\n")
    println("${ship3.name}\n${ship3.speed}\n${ship3.loadCapacity}\n")
}