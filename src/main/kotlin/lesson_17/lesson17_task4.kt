package org.example.lesson_17

class Package(
    val numberOfPackage: Int,
    currentLocation: String,
) {
    var movementCount = 0

    var currentLocation = currentLocation
        set(value) {
            field = value
            movementCount++
        }
}

fun main() {
    val package1 = Package(
        numberOfPackage = 218,
        currentLocation = "Точка-0"
    )

    package1.currentLocation = "Точка-1"
    package1.currentLocation = "Точка-2"
    println("Посылка прошла пунктов обработки: ${package1.movementCount}")
}