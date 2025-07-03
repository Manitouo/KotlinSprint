package org.example.lesson_20

fun main() {
    val elementsList: List<String> = listOf("один", "два", "три", "четыре")
    val lambda: (String) -> String = {it: String ->
        "Нажат элемент $it"
    }
    val indexedList = elementsList.filterIndexed { index, string ->
        index % 2 == 0
    }
    val changedElementsList = indexedList.map{
        lambda(it)
    }

    println(changedElementsList)
}