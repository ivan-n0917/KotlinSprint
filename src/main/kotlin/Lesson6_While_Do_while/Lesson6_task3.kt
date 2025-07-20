package org.example.Lesson6_While_Do_while

fun main() {

    println(" Таймер ")
    print("Введите количество секунд: ")

    val totalSeconds = readln().toIntOrNull() ?: run {
        return
    }

    println("Таймер запущен на $totalSeconds секунд...")

    var remainingSeconds = totalSeconds

    while (remainingSeconds > 0) {
        println("Осталось секунд: $remainingSeconds")
        Thread.sleep(1000L)
        remainingSeconds--
    }

    println("Время вышло")
}