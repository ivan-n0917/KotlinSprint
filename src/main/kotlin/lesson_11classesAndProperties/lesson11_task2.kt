package org.example.lesson_11classesAndProperties

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String,
) {

    fun printInfo() {
        println("ID: $id")
        println("Логин: $login")
        println("Почта: $email")
    }

    fun setBioFromConsole() {
        println("Напиши о себе:")
        val input = readln()
        bio = input
    }

    fun changePassword() {
        while (true) {
            println("Для изменения пароля введите текущий пароль:")
            val currentPassword = readln()
            if (currentPassword == password) {
                break
            } else {
                println("Неверный пароль! Попробуйте ещё раз.")
            }
        }

        println("Введите новый пароль:")
        password = readln()
        println("Пароль успешно изменён!")
    }
}

fun main() {

    val user = User2(
        id = 1,
        login = "ivanov",
        password = "oldpass123",
        email = "ivanov@example.com",
        bio = ""
    )

    println("Информация о пользователе:")
    user.printInfo()
    println()

    user.setBioFromConsole()
    println()

    user.changePassword()
    println()

    println("Информация о пользователе после изменений:")
    user.printInfo()
}

