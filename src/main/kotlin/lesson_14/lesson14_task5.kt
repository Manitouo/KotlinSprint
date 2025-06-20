package org.example.lesson_14

class Chat() {
    var messageId = 1
    var childMessagesList: MutableList<ChildMessage> = mutableListOf()
    var messagesList: MutableList<Message> = mutableListOf()

    fun addMessage(author: String, text: String) {
        val newMessage = Message(
            id = messageId++,
            author = author,
            text = text,
        )
        messagesList.add(newMessage)
    }

    fun addThreadMessage(author: String, text: String, parentMessageId: Int) {
        val newMessage = ChildMessage(
            id = messageId++,
            author = author,
            text = text,
            parentMessageId = parentMessageId,
        )
        childMessagesList.add(newMessage)
    }

    fun printChat() {

        val groupedChildMessages = childMessagesList.groupBy { it.parentMessageId }

        messagesList.forEach {
            println("${it.author}: ${it.text}")
            groupedChildMessages[it.id]?.forEach {
                println("   ${it.author}: ${it.text}")
            }
        }
    }
}

open class Message(
    val id: Int,
    val author: String,
    val text: String,
)

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int,
) : Message(id, author, text)

fun main() {
    val chat1 = Chat()

    chat1.addMessage("Николай", "Каждый")
    chat1.addThreadMessage("Кристина", "Охотник", 1)
    chat1.addThreadMessage("Григорий", "Желает", 1)
    chat1.addThreadMessage("Афанасий", "Знать", 1)
    chat1.addThreadMessage("Анастасия", "Где", 1)
    chat1.addThreadMessage("Светлана", "Сидит", 1)
    chat1.addThreadMessage("Александр", "Фазан", 1)
    chat1.addMessage("Ольга", "Начало обсуждения")
    chat1.addThreadMessage("Мирон", "Продолжение", 2)
    chat1.addThreadMessage("Петр", "Конец обсуждения", 2)

    chat1.printChat()
}