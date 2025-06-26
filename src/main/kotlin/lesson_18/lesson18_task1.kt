package org.example.lesson_18

class Order() {

    fun orderProcess(
        number: Int,
        order: String,
    ) {
        println("Заказан товар: $order")
    }

    fun orderProcess(
        number: Int,
        order: List<String>,
    ) {
        println("Заказаны следующие товары: ${order.joinToString(", ")}")

    }
}

fun main() {

    val order1 = Order()
    order1.orderProcess(number = 23, order = listOf("Товар-1", "Товар-2", "Товар-3"))
    order1.orderProcess(number = 2, order = "Товар-18")

}