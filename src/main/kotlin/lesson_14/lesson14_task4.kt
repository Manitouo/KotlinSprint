package org.example.lesson_14

abstract class CelestialBody(
    val name: String,
    val isPossibleToLand: Boolean,
    val hasAtmosphere: Boolean,
)

class Satellite(
    name: String,
    isPossibleToLand: Boolean,
    hasAtmosphere: Boolean,
) : CelestialBody(name, isPossibleToLand, hasAtmosphere)

class Planet(
    name: String,
    isPossibleToLand: Boolean,
    hasAtmosphere: Boolean,
    val satelliteList: List<Satellite>,
) : CelestialBody(name, isPossibleToLand, hasAtmosphere) {
    fun printInformation() {
        println("Спутники планеты $name: ")
        satelliteList.forEach {
            println(it.name)
        }
    }
}

fun main() {
    val satellite1 = Satellite("Объект-102", true, false)
    val satellite2 = Satellite("Угрой", false, false)

    val planet = Planet("Кенеша", true, true,
        mutableListOf(satellite1, satellite2))

    planet.printInformation()
}