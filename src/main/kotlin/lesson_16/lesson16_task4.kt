package org.example.lesson_16

class Order {
    protected var index = 0

    protected val numberOfOrder: Int = index++
    var isReady: Boolean = false

    fun getPermission(): String {
        print("Сейчас статус заказа: $isReady\nСменить статус? (да/нет): ")
        return readln()
    }

    fun changeStatus() {
        if (getPermission() == "да") {
            isReady = !isReady
            println("Статус изменен")
        }
        else if (getPermission() == "нет") println("Отказано в запросе")
        else println("Повторите запрос")
    }
}

fun main() {
    val order1 = Order()

    order1.changeStatus()
    order1.changeStatus()
}