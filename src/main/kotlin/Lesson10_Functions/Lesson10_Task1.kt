package org.example.Lesson10_Functions

fun main() {
    println("Игра в кости: человек против компьютера")

    val playerRoll = (1..6).random()
    val computerRoll = (1..6).random()

    println("Игрок бросает кости... Выпало: $playerRoll")

    println("Компьютер бросает кости... Выпало: $computerRoll")

    when {
        playerRoll > computerRoll -> println("Победило человечество!")
        computerRoll > playerRoll -> println("Победила машина!")
        else -> println("Победила дружба!")
    }
}

