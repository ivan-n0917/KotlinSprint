package org.example.lesson15_Abstraction_Interfaces

abstract class User(
    val name: String,
) {
    abstract fun readForum()
    abstract fun writeMessage(message: String)
}

class RegularUser(name: String) : User(name) {
    override fun readForum() {
        println("$name просматривает форум.")
    }

    override fun writeMessage(message: String) {
        println("$name пишет сообщение: \"$message\"")
    }
}

class AdminUser(name: String) : User(name) {
    override fun readForum() {
        println("$name просматривает форум.")
    }

    override fun writeMessage(message: String) {
        println("$name пишет сообщение: \"$message\"")
    }

    fun deleteMessage(message: String) {
        println("$name удаляет сообщение: \"$message\"")
    }

    fun deleteUser(userName: String) {
        println("$name удаляет пользователя $userName.")
    }
}

fun main() {
    val user = RegularUser("Юлия")
    val admin = AdminUser("Администратор")

    user.readForum()
    user.writeMessage("Привет, это обычное сообщение.")

    admin.readForum()
    admin.writeMessage("Это сообщение от Админисратора.")
    admin.deleteMessage("Админисратор удалил сообщение.")
    admin.deleteUser("Юлия")
}