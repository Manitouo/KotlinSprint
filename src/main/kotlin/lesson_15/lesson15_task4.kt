package org.example.lesson_15

interface Searching {
    fun searchProduct()
}

abstract class Product : Searching {
    abstract val category: String
    abstract val name: String
    abstract val count: Int

    override fun searchProduct() {
        println("Выполняется поиск")
    }
}

class Instrument(
    override val category: String = "Инструменты",
    override val name: String,
    override val count: Int,
) : Product()

class Accessory(
    override val category: String = "Комплектующие",
    override val name: String,
    override val count: Int,
) : Product()

fun main() {
    val instrument1 = Instrument(
        name = "Болгарка",
        count = 12,
    )

    val accessory1 = Accessory(
        name = "Пружина сжатия",
        count = 30,
    )

    instrument1.searchProduct()
    accessory1.searchProduct()
}