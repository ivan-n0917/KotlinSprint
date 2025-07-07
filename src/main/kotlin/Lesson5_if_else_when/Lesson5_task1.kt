package org.example.Lesson5_if_else_when

fun main() {

    val number1 = 12
    val number2 = 11
    val correctAnswer = number1 + number2

    println("Докажите что вы не бот: Решите пример $number1 + $number2")

    print("введите ответ: ")
    val answer = readln().toInt()

    if (answer == correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }


}