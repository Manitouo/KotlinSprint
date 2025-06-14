package org.example.lesson_15

interface Movement {
    fun startCarMovement()
    fun finishCarMovement()
}

interface PassengersMovement {
    fun loadingPassengers(count: Int)
    fun unloadingPassengers(count: Int): Int
}

interface CargoMovement {
    fun loadingCargo(count: Int)
    fun unloadingCargo(count: Int): Int
}

abstract class Auto : Movement, PassengersMovement {
    abstract val category: String
    abstract val passengersCapacity: Int
    abstract val loadCapacity: Int
    abstract var currentPassengerCount: Int

    override fun startCarMovement() {
        println("Машина отправилась в путь")
    }

    override fun finishCarMovement() {
        println("Машина доехала до конца пути")
    }

    override fun loadingPassengers(count: Int) {
        val assumedCount = currentPassengerCount + count
        if (assumedCount <= passengersCapacity && assumedCount >= 0) {
            currentPassengerCount = assumedCount
            println("В машину село пассажиров: $count")
        } else println("Машина может перевозить от 0 до $passengersCapacity пассажиров!")
    }

    override fun unloadingPassengers(count: Int): Int {
        val assumedCount = currentPassengerCount - count
        if (assumedCount <= passengersCapacity && assumedCount >= 0) {
            currentPassengerCount = assumedCount
            println("Из машины вышло пассажиров: $count")
            return count
        } else {
            println("Машина может перевозить от 0 до $passengersCapacity пассажиров!")
            return 0
        }
    }
}

class PassengerCar(
    override val category: String = "Легковой автомобиль",
    override val passengersCapacity: Int = 3,
    override val loadCapacity: Int = 0,
    override var currentPassengerCount: Int = 0,
) : Auto()

class Truck(
    override val category: String = "Грузовой автомобиль",
    override val passengersCapacity: Int = 1,
    override val loadCapacity: Int = 2,
    override var currentPassengerCount: Int = 0,
    var currentLoadCount: Int = 0,
) : Auto(), CargoMovement {
    override fun loadingCargo(count: Int) {
        val assumedCount = currentLoadCount + count
        if (assumedCount <= loadCapacity && assumedCount >= 0) {
            currentLoadCount = assumedCount
            println("В трак погрузили тонн груза: $count")
        } else println("Грузовик может перевезти от 0 до $loadCapacity тонн груза!")
    }

    override fun unloadingCargo(count: Int): Int {
        val assumedCount = currentLoadCount - count
        if (assumedCount <= loadCapacity && assumedCount >= 0) {
            currentLoadCount = assumedCount
            println("Трак выгрузил тонн груза: $count")
            return count
        } else {
            println("Грузовик может перевезти от 0 до $loadCapacity тонн груза!")
            return 0
        }
    }
}

fun main() {
    var transportedCargoCount = 0
    var transportedPassengersCount = 0

    val passengerCar1 = PassengerCar()
    val passengerCar2 = PassengerCar()
    val truck1 = Truck()

    passengerCar1.loadingPassengers(2)
    passengerCar1.startCarMovement()
    passengerCar1.finishCarMovement()
    transportedPassengersCount += passengerCar1.unloadingPassengers(2)
    println()
    passengerCar2.loadingPassengers(3)
    passengerCar2.startCarMovement()
    passengerCar2.finishCarMovement()
    transportedPassengersCount += passengerCar2.unloadingPassengers(3)
    println()
    truck1.loadingPassengers(1)
    truck1.loadingCargo(2)
    truck1.startCarMovement()
    truck1.finishCarMovement()
    transportedPassengersCount += truck1.unloadingPassengers(1)
    transportedCargoCount += truck1.unloadingCargo(2)

    println("\nБыло перевезено пассажиров: $transportedPassengersCount, тонн груза: $transportedCargoCount")
}