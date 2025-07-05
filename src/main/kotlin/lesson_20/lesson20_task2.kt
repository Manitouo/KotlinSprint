package org.example.lesson_20

const val MAX_HEALTH = 120

class Player(
    var name: String,
    var currentHealth: Int,
) {
    var maxHealth: Int = MAX_HEALTH

    fun printInformation() {
        println("$name - ${currentHealth}xp")
    }
}

fun main() {
    val restoreHealth: (Player) -> Unit = { player: Player ->
        if (player.currentHealth < player.maxHealth) player.currentHealth = player.maxHealth
    }

    val player1 = Player(
        name = "Григорий",
        currentHealth = 29,
    )
    player1.printInformation()
    restoreHealth(player1)
    println("Восстановление здоровья...")
    player1.printInformation()
}