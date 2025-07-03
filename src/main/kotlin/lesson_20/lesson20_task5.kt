package org.example.lesson_20

class Robot(
    val id: Int,
    val name: String,
) {
    val phrasesList = listOf("Добрый день", "Заказ выполнен",
        "Пройдите авторизацию", "Низкий уровень заряда", "До встречи!")
    var randomPhrase = phrasesList.random()

    fun say() {
        println(randomPhrase)
    }

    val setModifier: (String) -> Unit = {
        randomPhrase = it.reversed()
    }
}

fun main() {
    val robot = Robot(
        id = 214,
        name = "Виток-13"
    )

    robot.say()
    robot.setModifier(robot.randomPhrase)
    robot.say()
}