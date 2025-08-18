package org.example.lesson_11classesAndProperties

class ForumMember(
    val memberId: Int,
    val memberName: String
)

class Message(
    val authorId: Int,
    val message: String
)

class Forum {
    private val members = mutableListOf<ForumMember>()
    private val messages = mutableListOf<Message>()
    private var nextMemberId = 1

    fun createNewMember(memberName: String): ForumMember {
        val newMember = ForumMember(nextMemberId++, memberName)
        members.add(newMember)
        return newMember
    }

    fun createNewMessage(authorId: Int, message: String) {
        if (members.any { it.memberId == authorId }) {
            messages.add(Message(authorId, message))
        } else {
            println("Участник с ID $authorId не найден.")
        }
    }

    fun printThread() {
        if (messages.isEmpty()) {
            println("Сообщений пока нет.")
            return
        }

        for (message in messages) {
            val member = members.find { it.memberId == message.authorId }?.memberName ?: "Неизвестный"
            println("$member: ${message.message}")
        }
    }
}

fun main() {
    val forum = Forum()

    val member1 = forum.createNewMember("Alice")
    val member2 = forum.createNewMember("Bob")

    forum.createNewMessage(member1.memberId, "Привет, это мое первое сообщение!")
    forum.createNewMessage(member2.memberId, "Как у вас дела?")

    forum.printThread()
}