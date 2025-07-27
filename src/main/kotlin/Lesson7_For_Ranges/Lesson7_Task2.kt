package org.example.Lesson7_For_Ranges

fun main() {
    while (true) {
        val smsCode = (1000..9999).random()
        println("Ваш код авторизации: $smsCode")

        print("Введите код: ")
        when (readln().toIntOrNull()) {
            smsCode -> {
                println("Добро пожаловать! Авторизация успешна.")
                return
            }
            else -> println("Неверный код. Отправляем новый...")
        }
    }
}