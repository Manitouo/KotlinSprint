package org.example.lesson_17

class User(
    _login: String,
    val _password: String,
) {
    var login = _login
        set(value) {
            field = value
            println("Логин успешно изменен на $value")
        }

    var password: String
        get() {
            return "*".repeat(_password.length)
        }
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {
    val user = User(
        _login = "Пупырка_023",
        _password = "ultimate",
    )

    user.login = "Мякушка"
    println(user.password)
    user.password = "enotic"
}