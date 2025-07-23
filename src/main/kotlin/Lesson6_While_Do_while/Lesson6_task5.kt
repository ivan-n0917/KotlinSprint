package org.example.Lesson6_While_Do_while



fun main() {
    println(" Система авторизации ")
    println("Докажите, что вы не бот. Решите математический пример.")

    var attemptsLeft = 3

    while (attemptsLeft > 0) {
        val number1 = (1..9).random()
        val number2 = (1..9).random()
        val correctAnswer = number1 + number2

        print("Сколько будет $number1 + $number2? + (Осталось попыток: $attemptsLeft): ")
        when (readln().toIntOrNull()) {
            null -> println("Пожалуйста, введите число!")
            correctAnswer -> {
                println("Добро пожаловать!")
                return
            }

            else -> {
                println("Неверно!")
                attemptsLeft--
            }
        }
    }

    println("Доступ запрещен")
}