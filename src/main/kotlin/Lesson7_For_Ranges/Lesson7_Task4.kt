package org.example.Lesson7_For_Ranges

fun main() {
    print("Введите количество секунд: ")
    val totalSeconds = readln().toIntOrNull()

    println("Таймер запущен на $totalSeconds секунд")

    if (totalSeconds != null) {
        for (remainingSeconds in totalSeconds downTo 1) {
            println("Осталось: $remainingSeconds сек")
            Thread.sleep(1000)
        }
    }
    println("Время вышло!")
}