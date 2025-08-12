package org.example.Lesson10_Functions

fun main() {
    println("Игра в кости: человек против компьютера")
    var wins = 0

    do {
        val playerRoll = rollDice()
        val computerRoll = rollDice()

        println("\nИгрок бросает кости... Выпало: $playerRoll")
        println("Компьютер бросает кости... Выпало: $computerRoll")

        when {
            playerRoll > computerRoll -> {
                println("Победило человечество!")
                wins++
            }

            computerRoll > playerRoll -> println("Победила машина!")
            else -> println("Победила дружба!")
        }
    } while (playRound())

    println("\nИгра окончена. Ваших побед: $wins")
}

fun playRound(): Boolean {
    print("Ещё раз? Да/Нет: ")
    return readln().equals("Да", ignoreCase = true)
}

fun rollDice(): Int = (1..6).random()