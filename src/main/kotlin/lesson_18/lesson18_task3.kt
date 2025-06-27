package org.example.lesson_18

abstract class Animal(
    _name: String,
) {
    open val name: String = _name
    open val meal: String = ""

    fun feeding() {
        println(String.format("%s -> ест %s", name, meal))
    }

    fun sleeping() {
        println(String.format("%s -> спит", name))
    }
}

class Fox(
    _name: String,
) : Animal(_name) {
    override val meal: String = "ягоды"
}

class Dog(
    _name: String,
) : Animal(_name) {
    override val meal: String = "кости"
}

class Cat(
    _name: String,
) : Animal(_name) {
    override val meal: String = "рыбу"
}

fun main() {
    val animalList: MutableList<Animal> = mutableListOf()
    val fox1: Animal = Fox(
        _name = "Алиса",
    )
    val dog1: Animal = Dog(
        _name = "Шарик",
    )
    val cat1: Animal = Cat(
        _name = "Муся",
    )

    animalList.add(fox1)
    animalList.add(dog1)
    animalList.add(cat1)

    for (element in animalList) {
        element.feeding()
    }
}