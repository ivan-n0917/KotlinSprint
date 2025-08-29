package org.example.lesson16_encapsulation

class User(
    val login: String,
    private val password: String,
) {
    fun validatePassword(input: String): Boolean {
        return input == password
    }
}

fun main() {
    val user = User("ivanov", "12345")

    println("Введите пароль для входа:")
    val inputPassword = readln()

    val isValid = user.validatePassword(inputPassword)

    if (isValid) {
        println("Пароль верен. Добро пожаловать!")
    } else {
        println("Неверный пароль.")
    }
}