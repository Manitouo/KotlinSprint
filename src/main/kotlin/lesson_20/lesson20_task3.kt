package org.example.lesson_20

class Player(
    var hasKey: Boolean = false,
)

fun main() {
    val player1 = Player();

    val keyChecking = { player: Player ->
        if (player.hasKey) println("Игрок открыл дверь") else println("Дверь заперта")
    }

    keyChecking(player1)
    player1.hasKey = true
    keyChecking(player1)
}