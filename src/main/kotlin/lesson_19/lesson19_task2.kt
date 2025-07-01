package org.example.lesson_19

import kotlin.random.Random

enum class Category {
    CLOTHES,
    STATIONERY,
    OTHER;

    fun printCategoryName(): String {
        return when (this) {
            CLOTHES -> "Одежда"
            STATIONERY -> "Канцелярские товары"
            OTHER -> "Разное"
        }
    }
}

class Product(
    val name: String,
    val category: Category,
    id: Int = 0,
) {
    val id = Random.nextInt(0, 50)

    fun printInformation() {
        println("$name, $id, ${category.printCategoryName()}")
    }
}

fun main() {
    val pen = Product(
        name = "Ручка",
        category = Category.STATIONERY,
    )
    val shirt = Product(
        name = "Рубашка",
        category = Category.CLOTHES,
    )
    val candle = Product(
        name = "Свечка",
        category = Category.OTHER,
    )

    pen.printInformation()
    shirt.printInformation()
    candle.printInformation()
}
