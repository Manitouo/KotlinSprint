package org.example.lesson_5

fun main() {
    val hiddenNumber1 = 4 //первое загаданное число
    val hiddenNumber2 = 23 //второе загаданное число

    print("Введите первое число от 0 до 42: ")
    val number1 = readln().toInt()
    print("Введите второе число от 0 до 42: ")
    val number2 = readln().toInt()

    val comparison1 = number1 == hiddenNumber1 || number1 == hiddenNumber2
    val comparison2 = number2 == hiddenNumber1 || number2 == hiddenNumber2

    if (comparison1 && comparison2) println("Поздравляем! Вы выиграли главный приз!")
    else if (comparison1 || comparison2) println("Вы выиграли утешительный приз!")
    else println("Неудача!")

    print("Были загаданы $hiddenNumber1 и $hiddenNumber2")
}
