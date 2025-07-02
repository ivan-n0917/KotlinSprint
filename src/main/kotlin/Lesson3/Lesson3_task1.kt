package org.example.Lesson3

import java.time.LocalTime

fun main() {
    val userName = "Иван"
    val currentTime = LocalTime.now()

    val greeting = when {
        currentTime.hour in 12..17 -> "Добрый день"

        else -> "Добрый вечер"
    }

    println("$greeting, $userName!")
}