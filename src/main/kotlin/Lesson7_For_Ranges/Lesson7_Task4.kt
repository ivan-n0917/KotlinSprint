package org.example.Lesson7_For_Ranges

fun main() {
    print("Введите количество секунд: ")
    val totalSeconds = readln().toIntOrNull()

    if (totalSeconds != null) {
        println("Таймер запущен на $totalSeconds секунд")

        for (remainingSeconds in totalSeconds downTo 1) {
            println("Осталось: $remainingSeconds сек")
            Thread.sleep(1000)
        }
        println("Время вышло!")
    }
}
