package org.example.Lesson10_Functions

fun main() {

    println("Введите длину пароля:")
    val length = readln().toInt()

    val password = generatePassword(length)
    println("Сгенерированный пароль: $password")
}

fun generatePassword(length: Int): String {

    val digits = "0123456789"
    val symbols = listOf(
        '!', '"', '#', '$', '%', '&',
        '\'', '(', ')', '*', '+', ',', '-', '.', '/', ' '
    )

    val password = StringBuilder()

    for (i in 0 until length) {

        if (i % 2 == 0) {
            password.append(digits.random())
        } else {
            password.append(symbols.random())
        }
    }

    return password.toString()
}