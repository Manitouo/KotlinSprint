package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String? = null,
) {
    fun printInformation() {
        println(id)
        println(login)
        println(password)
        println(mail)
        println(bio)
    }

    fun addBioInformation() {
        println("О себе: ")
        bio = readln()
    }

    fun changePassword() {
        println("Введите текущий пароль")

        if (readln() == password) {
            println("Введите новый пароль: ")
            password = readln()
            println("Пароль успешно изменен!")
        } else println("Пароль введен неверно")
    }
}

fun main() {
    val user1 = User2(
        id = 3,
        login = "John",
        password = "12345",
        mail = "john@example.ru",
    )

    user1.addBioInformation()
    user1.changePassword()
    user1.printInformation()
}