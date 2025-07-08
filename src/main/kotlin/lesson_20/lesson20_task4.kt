package org.example.lesson_20

fun main() {
    val elementsList: MutableList<String> = mutableListOf("один", "два", "три", "четыре")

    val lambda: (String) -> Unit = { it: String ->
        println("Нажат элемент $it")
    }

    elementsList.forEachIndexed { index, it ->
        if (index % 2 == 0) lambda(it)
    }
}