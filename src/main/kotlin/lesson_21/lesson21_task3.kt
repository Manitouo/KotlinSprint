package org.example.lesson_21

const val MAX_HEALTH = 120

class Player(
    var name: String,
    var currentHealth: Int,
    var maxHealth: Int = MAX_HEALTH
)

fun Player.isHealthy(): Boolean {
    return (this.currentHealth == maxHealth)
}

fun main() {
    val player1 = Player(
        name = "Григорий",
        currentHealth = 29,
    )

    println(player1.isHealthy())
    player1.currentHealth = player1.maxHealth
    println(player1.isHealthy())
}