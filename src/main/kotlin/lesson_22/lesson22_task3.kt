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
    println(user1.toString())
}