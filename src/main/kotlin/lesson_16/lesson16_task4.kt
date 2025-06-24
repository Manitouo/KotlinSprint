package org.example.lesson_16

class Order {
    protected var index = 0

    protected val numberOfOrder: Int = index++
    var isReady: Boolean = false

    fun getPermission() {
        print("Сейчас статус заказа: $isReady\nСменить статус? (да/нет): ")
        val answer = readln()
        changeStatus(answer)
    }

    private fun changeStatus(answer: String) {
        when (answer) {
            "да" -> {
                isReady = !isReady
                println("Статус изменен")
            }
            "нет" -> println("Отказано в запросе")
            else -> println("Повторите запрос")
        }
    }
}

fun main() {
    val order1 = Order()

    order1.getPermission()
    order1.getPermission()
}