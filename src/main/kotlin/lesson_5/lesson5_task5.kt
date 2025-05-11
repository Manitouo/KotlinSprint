package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val hiddenList = listOf(Random.nextInt(0, 42), Random.nextInt(0, 42),
        Random.nextInt(0, 42))
    val userList: MutableList<Int> = mutableListOf()

    //println(hiddenList)

    print("Введите первое число: ")
    userList.add(readln().toInt())
    print("Введите второе число: ")
    userList.add(readln().toInt())
    print("Введите третье число: ")
    userList.add(readln().toInt())

    val match = (hiddenList.intersect(userList)).count()

    when (match) {
        0 -> println("Вы не угадали ни одного числа")
        1 -> println("Вы угадали одно число и получаете утешительный приз!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        3 -> println("Вы угадали все числа и выиграли джекпот!")
    }

    print("Загаданные числа: ${hiddenList[0]}, ${hiddenList[1]}, ${hiddenList[2]}")
}