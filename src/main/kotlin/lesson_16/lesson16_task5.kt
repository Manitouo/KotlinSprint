package org.example.lesson_16

const val MAX_HEALTH = 150
const val HEALING_POWER = 25

class Gamer(
    val name: String,
    var shotPower: Int,
    protected var health: Int = MAX_HEALTH,
) {
    var canHealing = true

    fun damageHealth(enemy: Gamer) {
        if (enemy.shotPower > health) {
            health = 0
            shotPower = 0
            canHealing = false
            println("\nПолучен критический урон: ${enemy.shotPower}\n$name, игра окончена, вы не можете лечиться\nЗдоровье: $health\nСила удара: $shotPower ")
        } else {
            health -= enemy.shotPower
            println("Получен урон: ${enemy.shotPower}. Текущее здоровье: $health")
        }
    }

    fun healingHealth() {
        if (canHealing) {
            health += HEALING_POWER
            if (health > MAX_HEALTH) health = MAX_HEALTH
            println("Пополнение здоровья на: $HEALING_POWER. Текущее здоровье: $health")
        }
    }
}

fun main() {
    val gamer1 = Gamer(
        name = "Екатерина",
        shotPower = 47,
    )
    val enemy1 = Gamer(
        name = "Арсений",
        shotPower = 52,
    )
    val enemy2 = Gamer(
        name = "Татьяна",
        shotPower = 29,
    )

    gamer1.healingHealth()
    gamer1.damageHealth(enemy2)
    gamer1.damageHealth(enemy1)
    gamer1.damageHealth(enemy1)
    gamer1.healingHealth()
    gamer1.damageHealth(enemy1)
    gamer1.healingHealth()
}