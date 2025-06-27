package org.example.lesson_17

class Folder(
    name: String,
    filesCount: Int,
    var isSecret: Boolean = false,
) {
    val filesCount = filesCount
        get() {
            return if (isSecret) 0
            else field
        }

    val name = name
        get() {
            return if (isSecret) "скрытая папка"
            else field
        }

    fun printInformation() {
        println("$name\nкол-во файлов - $filesCount")
    }
}

fun main() {
    val folder1 = Folder(
        name = "общедоступная папка",
        filesCount = 12,
    )

    folder1.printInformation()
    println()
    folder1.isSecret = true
    folder1.printInformation()
}