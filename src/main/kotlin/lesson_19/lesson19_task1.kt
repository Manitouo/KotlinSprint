package org.example.lesson_19

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun printFishList() {
    Fish.entries.forEach {
        when(it) {
            Fish.GUPPY -> println("Гуппи")
            Fish.ANGELFISH -> println("Скалярий")
            Fish.GOLDFISH -> println("Золотая рыбка")
            Fish.SIAMESE_FIGHTING_FISH -> println("Петушок")
        }
    }
}

fun main() {
    println("Вам доступны следующие рыбки:")

    printFishList()
}