package org.example.lesson_16

import kotlin.math.pow

private const val PI = 3.14

class Circle(
    protected val radius: Double
) {
    fun lengthCircle() {
       println("Длина окружности: ${"%.2f".format(2 * PI * radius)}")
    }
    fun squareCircle() {
        println("Площадь окружности: ${"%.2f".format(PI * radius.pow(2.0))}")
    }
}

fun main() {
    val circle1 = Circle(radius = 5.0)

    circle1.lengthCircle()
    circle1.squareCircle()
}