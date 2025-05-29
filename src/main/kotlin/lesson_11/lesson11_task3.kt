package org.example.lesson_11

class User3(
    val id: Int,
    val nickname: String,
    var picture: String,
    var status: String = "микрофон выключен",
)

class Room(
    val id: Int,
    var picture: String = "Обложка",
    var name: String,
    var listOfMembers: List<User3>,
) {
    fun addUser(user: User3) {
        listOfMembers += user
    }

    fun getList() {
        listOfMembers.forEach {
            println("${it.nickname} - ${it.status}")
        }
    }

    fun updateStatus(name: String, statusNew: String) {
        listOfMembers.forEach {
            if (name == it.nickname) it.status = statusNew
        }
    }
}

fun main() {
    val user1 = User3(
        id = 4,
        nickname = "Alex",
        picture = "Аватар Александра",
        status = "микрофон выключен"
    )
    val user2 = User3(
        id = 5,
        nickname = "Sophie",
        picture = "Аватар Софьи",
        status = "микрофон заглушен"
    )

    val room = Room(
        id = 5,
        name = "Комната 1",
        listOfMembers = listOf()
    )

    room.addUser(user1)
    room.addUser(user2)

    room.updateStatus("Sophie", "микрофон включен")

    println(user2.status)
    println(room.getList())
}