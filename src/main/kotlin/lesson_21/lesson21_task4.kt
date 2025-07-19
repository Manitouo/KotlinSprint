package org.example.lesson_21

import java.io.File

fun File.addTextToStart(string: String) {
    val startText = this.readText()
    this.writeText("$string$startText")
}

fun main() {
    val newFile = File("Task_4")
    newFile.addTextToStart("Добавленный текст ")
    println(newFile.readText())
}