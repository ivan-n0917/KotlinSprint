package org.example.Lesson10_Functions

const val CORRECT_LOGIN = "admin"
const val CORRECT_PASSWORD = "qwerty123"

fun main() {
    val token = authorize()

    token?.let {
        val cart = getCart(it)
        println("\nАвторизация успешна! Ваша корзина:")
        cart.forEachIndexed { i, item -> println("${i + 1}. $item") }
    } ?: println("\nОшибка авторизации!")
}

fun authorize(): String? {
    return readln().let { login ->
        readln().takeIf { it == CORRECT_PASSWORD && login == CORRECT_LOGIN }?.let { generateToken() }
    }
}

fun getCart(token: String): List<String> {
    return listOf("Ноутбук", "Смартфон", "Наушники", "Книга")
}

fun generateToken(): String {
    return (1..32).map {
        (('a'..'z') + ('A'..'Z') + ('0'..'9')).random()
    }.joinToString("")
}