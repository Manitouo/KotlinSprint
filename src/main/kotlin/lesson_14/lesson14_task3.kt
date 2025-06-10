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
    val radius: Int,
) : Figure(color) {
    override fun calculateArea(): Double {
        return PI * radius.toDouble().pow(2.0)
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

    val circle1 = Circle(color = "черный", radius = 5)
    val circle2 = Circle(color = "белый", radius = 7)
    val rectangle1 = Rectangle(color = "черный", width = 5.0, height = 7.0)
    val rectangle2 = Rectangle(color = "белый", width = 9.0, height = 2.0)
    val rectangle3 = Rectangle(color = "черный", width = 7.0, height = 4.0)

    val listOfFigures: List<Figure> = listOf(circle1, circle2, rectangle1, rectangle2, rectangle3)

    listOfFigures.forEach {
        if (it.color == "черный") sumPerimeter += it.calculatePerimeter()
        else sumArea += it.calculateArea()
    }

    println("Сумма периметров черных фигур = $sumPerimeter\nСумма площадей белых фигур = $sumArea")
}