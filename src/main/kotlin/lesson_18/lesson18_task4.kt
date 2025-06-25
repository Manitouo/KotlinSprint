package org.example.lesson_18

import kotlin.math.pow

class Box() {

    fun packageCalculation(
        width: Double,
        height: Double,
        depth: Double,
    ) {
        println("Площадь поверхности прямоугольной посылки: " +
                "%.2f".format(2 * (width * height + width * depth + height * depth))
        )
    }

    fun packageCalculation(
        side: Double,
    ) {
        println("Площадь поверхности прямоугольной посылки: ${"%.2f".format(6 * side.pow(2.0))}")
    }

}

fun main() {
    val box = Box()

    box.packageCalculation(
        width = 23.1,
        height = 12.8,
        depth = 9.2,
    )

    box.packageCalculation(
        side = 12.4
    )
}