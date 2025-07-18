package org.example.lesson_21

fun String.vowelCount(): Int {
    val vowels = "aeiou"
    return this.count {
        it.lowercase() in vowels
    }
}

fun main() {
    println("hello".vowelCount())
}