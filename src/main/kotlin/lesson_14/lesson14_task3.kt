package org.example.lesson_14

import kotlin.math.PI
import kotlin.math.pow

abstract class Figure(
    val color: String,
) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun calculateArea(): Double {
        return PI * radius.pow(2.0)
    }

    override fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {
    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }
}

fun main() {
    var sumArea = 0.0
    var sumPerimeter = 0.0

    val circle1 = Circle(color = BLACK_COLOR, radius = 5.0)
    val circle2 = Circle(color = WHITE_COLOR, radius = 7.0)
    val rectangle1 = Rectangle(color = BLACK_COLOR, width = 5.0, height = 7.0)
    val rectangle2 = Rectangle(color = WHITE_COLOR, width = 9.0, height = 2.0)
    val rectangle3 = Rectangle(color = BLACK_COLOR, width = 7.0, height = 4.0)

    val listOfFigures: List<Figure> = listOf(circle1, circle2, rectangle1, rectangle2, rectangle3)

    val blackFigures = listOfFigures.filter { it.color == BLACK_COLOR }
    val whiteFigures = listOfFigures.filter { it.color == WHITE_COLOR }

    sumPerimeter = blackFigures.sumOf { it.calculatePerimeter() }
    sumArea = whiteFigures.sumOf { it.calculateArea() }

    println("Сумма периметров черных фигур = $sumPerimeter\nСумма площадей белых фигур = $sumArea")
}

const val BLACK_COLOR = "черный"
const val WHITE_COLOR = "белый"