package org.example.lesson_18

open class Animal() {
    open fun feeding() {}
    open fun sleeping() {}
}

class Fox(
    private val name: String,
    private val meal: String = "ягоды",
) : Animal() {
    override fun feeding() {
        println(String.format("%s -> ест %s", name, meal))
    }

    override fun sleeping() {
        println(String.format("%s -> спит", name))
    }
}

class Dog(
    private val name: String,
    private val meal: String = "кости",
) : Animal() {
    override fun feeding() {
        println(String.format("%s -> ест %s", name, meal))
    }

    override fun sleeping() {
        println(String.format("%s -> спит", name))
    }
}

class Cat(
    private val name: String,
    private val meal: String = "рыбу",
) : Animal() {
    override fun feeding() {
        println(String.format("%s -> ест %s", name, meal))
    }

    override fun sleeping() {
        println(String.format("%s -> спит", name))
    }
}

fun main() {
    val animalList: MutableList<Animal> = mutableListOf()
    val fox1: Animal = Fox(
        name = "Алиса"
    )
    val dog1: Animal = Dog(
        name = "Шарик"
    )
    val cat1: Animal = Cat(
        name = "Муся"
    )

    animalList.add(fox1)
    animalList.add(dog1)
    animalList.add(cat1)

    for (element in animalList) {
        element.feeding()
    }
}