package org.example.Lesson10_Functions

fun main() {
    println("Добро пожаловать! Придумайте логин и пароль")

    println("Введите логин:")
    val login = readln()

    println("Введите пароль:")
    val password = readln()

    if (validateCredentials(login, password)) {
        println("Регистрация прошла успешно! Добро пожаловать, $login!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun validateCredentials(login: String, password: String): Boolean {
    return login.length >= 4 && password.length >= 4
}