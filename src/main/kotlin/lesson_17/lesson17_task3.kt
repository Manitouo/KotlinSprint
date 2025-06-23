package org.example.lesson_17

class Folder(
    name: String,
    val filesCount: Int,
    var isSecret: Boolean = false,
) {
    val name = name
        get() {
            return if (isSecret) "скрытая папка\nкол-во файлов - 0"
            else "$field\nкол-во файлов - $filesCount"
        }
}

fun main() {
    val field1 = Folder(
        name = "общедоступная папка",
        filesCount = 12,
    )
    println(field1.name)
    println()
    field1.isSecret = true
    println(field1.name)
}