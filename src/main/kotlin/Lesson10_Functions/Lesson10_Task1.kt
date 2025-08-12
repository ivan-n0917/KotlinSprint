package org.example.Lesson10_Functions

fun rollDice(): Int {
    return (1..6).random()
}

fun main() {
    println("Игра в кости: человек против компьютера")

    val playerRoll = rollDice()
    val computerRoll = rollDice()

    println("Игрок бросает кости... Выпало: $playerRoll")
    println("Компьютер бросает кости... Выпало: $computerRoll")

    when {
        playerRoll > computerRoll -> println("Победило человечество!")
        computerRoll > playerRoll -> println("Победила машина!")
        else -> println("Победила дружба!")
    }
}

