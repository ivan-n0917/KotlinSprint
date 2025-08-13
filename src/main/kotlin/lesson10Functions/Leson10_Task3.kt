package org.example.Lesson10_Functions

fun main() {
    println("Введите длину пароля:")
    val length = readln().toInt()

    val password = generatePassword(length)
    println("Сгенерированный пароль: $password")
}

fun generatePassword(length: Int): String {

    val digits = '0'..'9'
    val symbols = ' '..'/'

    return (0 until length).joinToString("") { i ->
        if (i % 2 == 0) digits.random().toString()
        else symbols.random().toString()
    }
}