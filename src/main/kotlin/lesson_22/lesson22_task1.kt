package org.example.lesson_22

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)

fun main() {
    val regularBook1 = RegularBook(
        name = "Дом, в котором...",
        author = "Мариам Петросян",
    )

    val regularBook2 = RegularBook(
        name = "Дом, в котором...",
        author = "Мариам Петросян",
    )

    val dataBook1 = DataBook(
        name = "Охота на электроовец",
        author = "Сергей Марков",
    )

    val dataBook2 = DataBook(
        name = "Охота на электроовец",
        author = "Сергей Марков",
    )

    println("Результат сравнения объектов обычного класса: ${regularBook1.equals(regularBook2)}")
    println("Результат сравнения объектов data-класса: ${dataBook1.equals(dataBook2)}")

    //data-классы - сравнение содержимого, обычные классы - сравниваются ссылки на объекты
}