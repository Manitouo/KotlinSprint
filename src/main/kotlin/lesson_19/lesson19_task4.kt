package org.example.lesson_19

import kotlin.math.tan

enum class Patron {
    BLUE,
    GREEN,
    RED,
    EMPTY;

    fun getATK(): Int {
        when (this) {
            BLUE -> return 5
            GREEN -> return 10
            RED -> return 20
            EMPTY -> return 0
        }
    }
}

class Tank(
    val name: String,
    val category: String,
) {
    private var atk: Int = 0

    fun arm(patronType: Patron) {
        atk = patronType.getATK()
        println("Смена вооружения. Текущая АТК: $atk")
    }

    fun shoot() {
        if (atk != 0) println("Нанесен урон по цели -$atk")
        else println("Нет патронов!")
    }
}

fun main() {
    val tank = Tank(
        name = "T-14",
        category = "Гусеничный",
    )

    tank.arm(Patron.BLUE)
    tank.shoot()
    tank.arm(Patron.RED)
    tank.shoot()
    tank.arm(Patron.GREEN)
    tank.shoot()
    tank.arm(Patron.EMPTY)
    tank.shoot()
}