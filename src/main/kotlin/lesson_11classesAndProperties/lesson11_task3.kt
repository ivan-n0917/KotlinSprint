package org.example.lesson_11classesAndProperties

class User(
    val username: String,
    val avatar: String = "default_avatar.png",
) {
    var status: String = "микрофон выключен"

    override fun toString(): String {
        return "$username ($avatar)"
    }
}

class VoiceRoom(
    val name: String,
    val cover: String = "default_cover.jpg",
    private val participants: MutableList<User> = mutableListOf(),
) {

    fun addParticipant(user: User) {
        participants.add(user)
        println("Пользователь ${user.username} присоединился к комнате '$name'.")
    }

    fun updateStatus(username: String, newStatus: String) {
        val user = participants.find { it.username == username }
        if (user != null) {
            newStatus.also { user.status = it }
            println("Статус пользователя $username изменён на \"$newStatus\".")
        } else {
            println("Пользователь $username не найден в комнате '$name'.")
        }
    }

    fun printInfo() {
        println("Комната: $name")
        println("Обложка: $cover")
        println("Участники:")
        for (user in participants) {
            println("- ${user.username} [${user.status}]")
        }
    }
}

fun main() {
    val user1 = User("Alex", "alex.jpg")
    val user2 = User("Masha", "masha.png")
    val user3 = User("Vasya", "vasya.png")

    val voiceRoom = VoiceRoom("Голосовые дуэли", "duels_cover.jpg")

    voiceRoom.addParticipant(user1)
    voiceRoom.addParticipant(user2)
    voiceRoom.addParticipant(user3)

    voiceRoom.updateStatus("Alex", "разговаривает")
    voiceRoom.updateStatus("Masha", "пользователь заглушен")
    voiceRoom.updateStatus("Vasya", "микрофон выключен")

    voiceRoom.printInfo()
}