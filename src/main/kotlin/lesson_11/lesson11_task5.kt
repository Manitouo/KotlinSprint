package org.example.lesson_11

data class ForumMember(
    val userId: Int,
    val userName: String,
)

data class ForumMessage(
    val authorId: Int,
    val message: String,
)

class Forum {

    var forumMessagesList: MutableList<ForumMessage> = mutableListOf()
    var forumMembersList: MutableList<ForumMember> = mutableListOf()
    var index = 0

    fun createNewUser(name: String): ForumMember {
        val newUser = ForumMember(
            userId = index++,
            userName = name,
        )
        forumMembersList.add(newUser)
        return newUser
    }

    fun createNewMessage(id: Int, message: String) {
        if (forumMembersList.any{it.userId == id}) {
            val newMessage = ForumMessage (
                authorId = index++,
                message = message,
            )
            forumMessagesList.add(newMessage)
        }
    }

    fun printThread() {
        for (message in forumMessagesList) {
            val author = forumMembersList.find { it.userId == message.authorId }?.userName
            println("$author: ${message.message}")
        }
    }
}

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Анастасия")
    val user2 = forum.createNewUser("Владимир")

    forum.createNewMessage(user1.userId, "Привет!")
    forum.createNewMessage(user2.userId, "Здравствуйте!")
    forum.createNewMessage(user1.userId, "У нас сегодня солнечно")
    forum.createNewMessage(user2.userId, "Отлично!")

    forum.printThread()
}