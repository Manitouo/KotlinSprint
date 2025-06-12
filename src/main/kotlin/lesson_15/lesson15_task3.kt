package org.example.lesson_15

//interface Deleting {
//    fun deleteUser()
//    fun deleteMessage()
//}

interface Actions {
    fun readForum()
    fun printMessage()
}

abstract class User : Actions {
    abstract val id: Int
    abstract val name: String
    abstract val status: String

    override fun printMessage() {
        println("$status $name написал сообщение")
    }

    override fun readForum() {
        println("$status $name просматривает форум")
    }
}

class AverageUser (
    override val id: Int,
    override val name: String,
    override val status: String = "Пользователь",
) : User()

class Administrator (
    override val id: Int,
    override val name: String,
    override val status: String = "Администратор",
) : User() {
    fun deleteUser() {
        println("$status $name удалил пользователя")
    }
    fun deleteMessage() {
        println("$status $name удалил сообщение")
    }
}

fun main() {
    val averageUser = AverageUser (
        id = 1,
        name = "Степан",
    )
    val administrator = Administrator (
        id = 2,
        name = "Николай"
    )

    averageUser.printMessage()
    administrator.deleteMessage()
    administrator.readForum()
}