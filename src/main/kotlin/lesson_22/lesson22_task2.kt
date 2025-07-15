package org.example.lesson_22

class RegularBookTask2(
    val name: String,
    val author: String,
)

data class DataBookTask2(
    val name: String,
    val author: String,
)

fun main() {
    val regularBook = RegularBookTask2(
        name = "Воскресение",
        author = "Л.Н.Толстой",
    )

    val dataBook = DataBookTask2(
        name = "Шантарам",
        author = "Д.Робертс",
    )

    println("Содержимое объекта обычного класса: ${regularBook}")
    println("Содержимое объекта data-класса: ${dataBook}")

    //data-классы представляют информацию в удобочитаемом формате, обычные классы - выводят хэш-код объекта
}