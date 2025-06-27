package org.example.lesson_18

import kotlin.math.pow

abstract class Box() {
    open fun packageCalculation() {}
}

class RectangularBox(
    val width: Double,
    val height: Double,
    val depth: Double,
) : Box() {
    override fun packageCalculation() {
        println("Площадь поверхности прямоугольной посылки: " +
                "%.2f".format(2 * (width * height + width * depth + height * depth))
        )
    }
}

class SquareBox(
    val side: Double,
) : Box() {
    override fun packageCalculation() {
        println("Площадь поверхности прямоугольной посылки: ${"%.2f".format(6 * side.pow(2.0))}")
    }
}

fun main() {
    val rectangularBox: Box = RectangularBox(
        width = 23.1,
        height = 12.8,
        depth = 9.2,
    )
    val squareBox: Box = SquareBox(
        side = 12.4,
    )

    rectangularBox.packageCalculation()
    squareBox.packageCalculation()
}