package org.example.lesson_11

class User3(
    val id: Int,
    val nickname: String,
    var picture: String,
    var status: String,
) {
    fun updateStatus(statusNew: String) {
        status = statusNew
    }
}

class Room(
    val id: Int,
    var picture: String = "Обложка",
    var name: String,
    var listOfMembers: Any? = null,
) {
    fun addUser(user: User3){
        listOfMembers = user
    }
}

fun main() {
    val user = User3 (
        id = 4,
        nickname = "Alex",
        picture = "Аватар Александра",
        status = "микрофон выключен"
    )
    val room = Room(
        id = 5,
        name = "Комната 1",
    )

    user.updateStatus("пользователь заглушен")
    println(user.status)
    room.addUser(user)
    println(room.listOfMembers)
}