package org.example.lesson_15

interface Movement {
    fun carMovement()
    fun passengersMovement()
    fun cargoMovement()
}

interface PassengersMovement {
    fun loadingPassengers(count: Int)
    fun unloadingPassengers(count: Int)
}

interface CargoMovement {
    fun loadingCargo(count: Int)
    fun unloadingCargo(count: Int)
}

abstract class Auto : Movement, PassengersMovement {
    abstract val category: String
    abstract val passengersCapacity: Int
    abstract val loadCapacity: Int
    abstract var currentPassengerCount: Int

    override fun carMovement() {
        println("Машина едет")
    }

    override fun passengersMovement() {
        println("В машине находится пассажиров: $currentPassengerCount")
    }

    override fun cargoMovement() {}

    override fun loadingPassengers(count: Int) {
        val assumedCount = currentPassengerCount + count
        if (assumedCount <= passengersCapacity && assumedCount >= 0) currentPassengerCount = assumedCount
        else println("Кол-во пассажиров: 0 < x < $passengersCapacity")
    }

    override fun unloadingPassengers(count: Int) {
        val assumedCount = currentPassengerCount - count
        if (assumedCount <= passengersCapacity && assumedCount >= 0) currentPassengerCount = assumedCount
        else println("Кол-во пассажиров: 0 < x < $passengersCapacity")
    }
}

class PassengerCar(
    override val category: String = "Легковой автомобиль",
    override val passengersCapacity: Int = 3,
    override val loadCapacity: Int = 0,
    override var currentPassengerCount: Int,
) : Auto() {
    init {
        if (currentPassengerCount > passengersCapacity) println("Максимальное количество пассажиров: 3")
    }
}

class Truck(
    override val category: String = "Грузовой автомобиль",
    override val passengersCapacity: Int = 1,
    override val loadCapacity: Int = 2,
    override var currentPassengerCount: Int,
    var currentLoadCount: Int,
) : Auto(), CargoMovement {
    init {
        if (currentPassengerCount > passengersCapacity) println("Максимальное количество пассажиров: 1")
        if (currentLoadCount > loadCapacity) println("Максимальное кол-во тонн: 2")
    }

    override fun cargoMovement() {
        println("Машина перевозит тонн груза: $currentLoadCount")
    }

    override fun loadingCargo(count: Int) {
        val assumedCount = currentLoadCount + count
        if (assumedCount <= loadCapacity && assumedCount >= 0) currentLoadCount = assumedCount
        else println("Кол-во тонн: 0 < x < $loadCapacity")
    }

    override fun unloadingCargo(count: Int) {
        val assumedCount = currentLoadCount - count
        if (assumedCount <= loadCapacity && assumedCount >= 0) currentLoadCount = assumedCount
        else println("Кол-во тонн: 0 < x < $loadCapacity")
    }
}

fun main() {
    val passengerCar1 = PassengerCar(
        currentPassengerCount = 2,
    )

    val passengerCar2 = PassengerCar(
        currentPassengerCount = 0,
    )

    val truck1 = Truck(
        currentPassengerCount = 1,
        currentLoadCount = 2,
    )

    passengerCar1.carMovement()
    passengerCar1.loadingPassengers(1)

    passengerCar2.loadingPassengers(2)

    println("")

    truck1.passengersMovement()
    truck1.cargoMovement()
    passengerCar1.passengersMovement()
    passengerCar2.passengersMovement()
}