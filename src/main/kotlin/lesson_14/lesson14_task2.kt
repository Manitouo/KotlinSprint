package org.example.lesson_14

open class LinerTask2(
    val name: String,
    val speed: Int,
    val loadCapacity: Int,
    var canCrackIce: Boolean = false,
) {
    open fun activateLoading() {
        println("Выдвигается горизонтальный трап со шкафута...")
    }

    fun printInformation() {
        println("$name\n$speed\n$loadCapacity\n$canCrackIce\n")
    }
}

class IcebreakerTask2(
    name: String,
    speed: Int,
    loadCapacity: Int,
) : LinerTask2(name, speed, loadCapacity, canCrackIce = true) {
    override fun activateLoading() {
        println("Открываются ворота со стороны кормы...")
    }
}

class CargoShipTask2(
    name: String,
    speed: Int,
    loadCapacity: Int,
) : LinerTask2(name, speed, loadCapacity) {
    override fun activateLoading() {
        println("Грузовой кран активируется...")
    }
}

fun main() {
    val ship1 = LinerTask2("Лайнер", 22, 3000)
    val ship2 = IcebreakerTask2("Ледокол", 20, 7540)
    val ship3 = CargoShipTask2("Грузовой", 22, 83000)

    ship1.activateLoading()
    ship2.activateLoading()
    ship3.activateLoading()

    ship2.printInformation()
}


