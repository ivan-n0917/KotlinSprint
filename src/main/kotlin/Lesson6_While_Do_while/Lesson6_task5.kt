package org.example.Lesson6_While_Do_while

import kotlin.random.Random

fun main() {
    println(" Система авторизации ")
    println("Докажите, что вы не бот. Решите математический пример.")

    var attemptsLeft = 3

    while (attemptsLeft > 0) {
        val a = Random.nextInt(1, 10)
        val b = Random.nextInt(1, 10)
        val correctAnswer = a + b

        print("Сколько будет $a + $b? (Осталось попыток: $attemptsLeft): ")
        val userAnswer = readln().toIntOrNull()

        when (userAnswer) {
            null -> {
                println("Пожалуйста, введите число!")
                continue
            }
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