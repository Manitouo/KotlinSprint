package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
)

fun main() {
    val user1: User = User(
        id = 1,
        login = "Leon",
        password = "123456",
        mail = "leon@example.ru",
    )
    val user2 = User(
        id = 2,
        login = "Ann",
        password = "7891011",
        mail = "ann@example.ru",
    )

    println("Данные первого пользователя:")
    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.mail)

    println("\nДанные второго пользователя:")
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.mail)
}