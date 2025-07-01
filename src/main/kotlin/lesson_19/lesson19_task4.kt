package org.example.lesson_19

enum class Patron(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank(
    val name: String,
    val category: String,
) {
    private var atk: Int? = null

    fun arm(patronType: Patron) {
        atk = patronType.damage
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
}