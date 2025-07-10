package org.example.Lesson5_if_else_when

fun main() {

    val winningNumbers = List(3) {(0..42).random() }
    val userNumbers = mutableListOf<Int>()

    println("Добро пожаловать в лотерею!")
    println("Угадайте три числа от 0 до 42 и выиграйте приз!")

    print("Введите первое число: ")
    readln().toInt()

    print("Введите второе число: ")
    readln().toInt()

    print("Введите третье число: ")
    readln().toInt()

    val matchedNumbers = userNumbers.intersect(winningNumbers.toSet())
    val matchCount = matchedNumbers.size

    when (matchCount) {
        3 -> println("Поздравляем! Вы угадали все три числа и выиграли ДЖЕКПОТ!")
        2 -> println("Отличный результат! Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз!")
        else -> println("К сожалению, вы не угадали ни одного числа.")
    }
    println("Выигрышные числа были: $winningNumbers")
}





