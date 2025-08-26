package org.example.lesson14Inheritance

abstract class Message(
    val id: Int,
    val text: String,
    val author: String
)

class RegularMessage(
    id: Int,
    text: String,
    author: String
) : Message(id, text, author)

class ChildMessage(
    id: Int,
    text: String,
    author: String,
    val parentMessageId: Int
) : Message(id, text, author)

class Chat {
    private val messages = mutableListOf<Message>()
    private var nextMessageId = 1

    fun addMessage(text: String, author: String): RegularMessage {
        val message = RegularMessage(nextMessageId++, text, author)
        messages.add(message)
        return message
    }

    fun addThreadMessage(
        text: String,
        author: String,
        parentMessageId: Int
    ): ChildMessage {
        val message = ChildMessage(nextMessageId++, text, author, parentMessageId)
        messages.add(message)
        return message
    }

    fun printChat() {

        val groupedByParent = messages.groupBy {
            if (it is ChildMessage) it.parentMessageId else -1
        }

        val topLevelMessages = groupedByParent[-1] ?: emptyList()

        for (message in topLevelMessages) {

            println("${message.id}. ${message.author}: ${message.text}")

            val replies = groupedByParent[message.id].orEmpty()

            for (reply in replies) {
                println("  ${reply.id}. ${reply.author}: ${reply.text}")
            }
        }
    }
}

fun main() {

    val chat = Chat()
    val msg1 = chat.addMessage("Привет, как дела?", "Анна")
    val msg2 = chat.addMessage("Всё нормально, спасибо!", "Иван")

    chat.addThreadMessage("Да, всё в порядке", "Мария", msg1.id)
    chat.addThreadMessage("Рад за тебя", "Петр", msg2.id)
    chat.addThreadMessage("Тоже рада", "Света", msg1.id)

    println("Чат:")
    chat.printChat()
}