package org.example.lesson_15

interface MovableFlying {
    fun fly()
}

interface MovableSwimming {
    fun swim()
}

class Carp : MovableSwimming {
    override fun swim() {
        println("Карась может только плавать")
    }
}

class Seagull : MovableFlying {
    override fun fly() {
        println("Чайка может только летать")
    }
}

class Duck : MovableFlying, MovableSwimming {

    override fun swim() {
        println("Утка может плавать")
    }

    override fun fly() {
        println("Утка может летать")
    }
}

fun main() {
    val carp = Carp()
    val seagull = Seagull()
    val duck = Duck()

    carp.swim()
    seagull.fly()
    duck.fly()
    duck.swim()
}