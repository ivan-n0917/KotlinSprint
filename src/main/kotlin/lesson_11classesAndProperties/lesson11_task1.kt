package org.example.lesson_11classesAndProperties

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {
    val user1 = User(145, "Polina", "654klj", "user@mail.ru")
    val user2 = User(263, "Natali", "368iuhi", "user2@mail.com")

    println("Пользователь 1")
    println("ID: ${user1.id}")
    println("Логин: ${user1.login}")
    println("Пароль: ${user1.password}")
    println("Почта: ${user1.email}")
    println()

    println("Пользователь 2")
    println("ID: ${user2.id}")
    println("Логин: ${user2.login}")
    println("Пароль: ${user2.password}")
    println("Почта: ${user2.email}")

}
