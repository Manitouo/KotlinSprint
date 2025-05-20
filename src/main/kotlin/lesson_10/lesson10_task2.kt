package org.example.lesson_10

fun main() {
    print("Введите логин: ")
    val login = readln()
    print("Введите пароль: ")
    val password = readln()

    comparison(login, password)
}

fun comparison(login: String, password: String) {
    if (login.length < 4 || password.length < 4) print("Логин или пароль недостаточно длинные")
    else print("Добро пожаловать!")
}