package org.example.lesson_5

fun main() {
    print("Введите ваш вес (кг): ")
    val weight = readln().toDouble()
    print("Введите ваш рост (см): ")
    val height = readln().toDouble()

    val heightInMetre = height / 100

    val bmi: Double = weight / (heightInMetre * heightInMetre)

    val result = when {
        bmi < 18.5 -> "недостаточная масса тела"
        bmi < 25.0 -> "нормальная масса тела"
        bmi < 30.0 -> "избыточная масса тела"
        else -> "ожирение"
    }

    print(String.format("ИМТ = %.2f - у вас $result", bmi))
}