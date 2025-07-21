package org.example.Lesson6_While_Do_while

fun main() {
    println("Таймер")
    print("Введите количество секунд: ")

    val seconds = readln().toIntOrNull()

    println("Таймер запущен на $seconds секунд...")

    if (seconds != null) {
        Thread.sleep(seconds * 1000L).toString()
    }
    println("Прошло $seconds секунд")
}
