package org.example.lesson_14

abstract class CelestialBody(
    val name: String,
    var isPossibleToLand: Boolean,
    var hasAtmosphere: Boolean,
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
    var listOfSatellite: MutableList<Satellite>,
) : CelestialBody(name, isPossibleToLand, hasAtmosphere) {
    fun printInformation() {
        println("Спутники планеты $name: ")
        listOfSatellite.forEach {
            println(it.name)
        }
    }
}

fun main() {
    val satellite1 = Satellite("Объект-102", true, false)
    val satellite2 = Satellite("Угрой", false, false)

    val Planet = Planet("Кенеша", true, true,
        mutableListOf(satellite1, satellite2))

    Planet.printInformation()
}