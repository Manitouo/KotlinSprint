package org.example.lesson_19

enum class Fish(var nameFish: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}

fun main() {
    println("Вам доступны следующие рыбки:")

    println(Fish.entries)
}