package org.example.lesson_22

data class User(
    val name: String,
    val age: Int,
    val phone: Long,
)

fun main() {
    val user1 = User(
        name = "Анатолий",
        age = 31,
        phone = 9819990000,
    )

    val (name, age, phone) = user1

    println("Имя: $name\nВозраст: $age\nНомер телефона: $phone")
}