package org.example.Lesson10_Functions

fun main() {

    val CORRECT_LOGIN = "admin"
    val CORRECT_PASSWORD = "qwerty123"
    val userCart = listOf("Ноутбук", "Смартфон", "Наушники", "Книга")

    val token = readln().let { login ->
        readln().takeIf { it == CORRECT_PASSWORD && login == CORRECT_LOGIN }?.let { generateToken() }
    }

    token?.let {
        println("\nАвторизация успешна! Ваша корзина:")
        userCart.forEachIndexed { i, item -> println("${i + 1}. $item") }
    } ?: println("\nОшибка авторизации!")
}

fun generateToken(): String {
    return (1..32).map {
        (('a'..'z') + ('A'..'Z') + ('0'..'9')).random()
    }.joinToString("")
}