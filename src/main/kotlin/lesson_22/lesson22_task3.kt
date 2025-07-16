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

    val nameUser1 = user1.component1()
    val ageUser1 = user1.component2()
    val phoneUser1 = user1.component3()

    println("Имя: $nameUser1\nВозраст: $ageUser1\nНомер телефона: $phoneUser1")
}