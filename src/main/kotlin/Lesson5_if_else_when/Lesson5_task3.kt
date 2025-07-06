package org.example.Lesson5_if_else_when

fun main() {

    val secretNumber1 = 8
    val secretNumber2 = 36

    println("Добро пожаловать в лотерею!")
    println("Угадайте два числа от 0 до 42 и выиграйте приз!")

    print("Введите первое число: ")
    val userNumber1 = readln().toInt()

    print("Введите второе число: ")
    val userNumber2 = readln().toInt()

    val guessedBoth = (userNumber1 == secretNumber1 && userNumber2 == secretNumber2) ||
            (userNumber1 == secretNumber2 && userNumber2 == secretNumber1)

    val guessedOne = (userNumber1 == secretNumber1 || userNumber1 == secretNumber2) ||
            (userNumber2 == secretNumber1 || userNumber2 == secretNumber2) && !guessedBoth

    when {
        guessedBoth -> println("Поздравляем! Вы выиграли главный приз!")
        guessedOne -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")
    }

}