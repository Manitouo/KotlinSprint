package org.example.lesson_18

class Screen() {
    fun draw(x: Int, y: Double) {
        println("Нарисована точка с координатами: ($x;$y)")
    }

    fun draw(x: Int, y: Int, r: Double) {
        println("Нариосван круг с центром в точке ($x;$y) и радусом ($r)")
    }

    fun draw(x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int,) {
        println("Нарисован квадрат с углами в точках: ($x1;$y1), ($x2;$y2), ($x3;$y3), ($x4;$y4)")
    }
}

fun main() {
    val screen = Screen()

    screen.draw(x = 5, y = 2.5)
    screen.draw(x = 2, y = 7, r = 1.9)
    screen.draw(x1 = 0, y1 = 0, x2 = 0, y2 = -3, x3 = -3, y3 = -3, x4 = -3, y4 = 0)
}