package org.example.Lesson6_While_Do_while

import kotlin.random.Random

fun main() {
    println(" Игра, в которой нужно угадать число")
    println("Угадайте число от 1 до 9. У вас 5 попыток!")

    val secretNumber = Random.nextInt(1, 10)
    var attemptsLeft = 5

    while (attemptsLeft > 0) {
        print("Ваше число(осталось попыток: $attemptsLeft): ")
        val guess = readln().toIntOrNull()

        when (guess) {
            null -> {
                println("Пожалуйста, введите число!")
                continue
            }
            secretNumber -> {
                println("Это была великолепная игра!")
                return
            }
            else -> {
                println("Неверно! Попробуйте ещё раз.")
                attemptsLeft--
            }
        }
    }

    println("Было загадано число $secretNumber")
}