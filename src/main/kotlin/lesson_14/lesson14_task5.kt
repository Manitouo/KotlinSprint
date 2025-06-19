package org.example.lesson_14

class Chat() {

    var messagesList: MutableList<PatternOfMessage> = mutableListOf()

    fun addMessage(id: Int, author: String, text: String) {
        val newMessage = Message(
            id = id,
            author = author,
            text = text,
        )
        messagesList.add(newMessage)
    }

    fun addThreadMessage(parentMessageId: Int, author: String, text: String) {
        val newMessage = ChildMessage(
            id = parentMessageId,
            author = author,
            text = text,
        )
        messagesList.add(newMessage)
    }

    fun printChat() {
        messagesList.forEach {
            if (it is Message) messagesList.groupBy {  }
        }
    }


    abstract class PatternOfMessage {
        abstract val id: Int
        abstract val author: String
        abstract val text: String
        abstract val type: String

    }

    class Message(
        override val id: Int,
        override val author: String,
        override val text: String,
        override val type: String = "Message",
    ) : PatternOfMessage()

    class ChildMessage(
        override val id: Int,
        override val author: String,
        override val text: String,
        override val type: String = "ChildMessage",
    ) : PatternOfMessage()

    fun main() {

        val chat1 = Chat()

        chat1.addMessage(1, "Николай", "Каждый")
        chat1.addThreadMessage(1, "Кристина", "Охотник")
        chat1.addThreadMessage(1, "Григорий", "Желает")
        chat1.addThreadMessage(1, "Афанасий", "Знать")
        chat1.addThreadMessage(1, "Анастасия", "Где")
        chat1.addThreadMessage(1, "Светлана", "Сидит")
        chat1.addThreadMessage(1, "Александр", "Фазан")
        chat1.addMessage(2, "Ольга", "Начало обсуждения")
        chat1.addThreadMessage(2, "Мирон", "Продолжение")
        chat1.addThreadMessage(2, "Петр", "Конец обсуждения")

        chat1.printChat()
    }
}