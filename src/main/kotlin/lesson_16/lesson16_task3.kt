package org.example.lesson_16

class User(
    protected val login: String,
    protected val password: String,
) {
    fun passwordValidation(enteredPassword: String): Boolean {
        return enteredPassword == password
    }
}

fun main() {
    val user1 = User(
        login = "Петр",
        password = "12345",
    )

    val user2 = User(
        login = "Анастасия",
        password = "mypassword",
    )

    println("Пароль введен верно: ${user1.passwordValidation("1234")}")
    println("Пароль введен верно: ${user2.passwordValidation("mypassword")}")
}