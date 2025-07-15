package org.example.lesson_20

class Robot(
    val id: Int,
    val name: String,
) {
    val phrasesList = listOf(
        "Добрый день", "Заказ выполнен",
        "Пройдите авторизацию", "Низкий уровень заряда", "До встречи!"
    )

    var reversedModifier: ((String) -> String)? = null

    fun setModifier(setModifier: (String) -> String) {
        reversedModifier = setModifier
    }

    fun say() {
        val randomPhrase = phrasesList.random()
        println(reversedModifier?.invoke(randomPhrase) ?: randomPhrase)
    }
}

fun main() {
    val robot = Robot(
        id = 214,
        name = "Виток-13"
    )

    robot.say()
    robot.setModifier({ it.reversed() })
    robot.say()
}