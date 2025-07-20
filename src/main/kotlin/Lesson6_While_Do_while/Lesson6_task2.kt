package org.example.Lesson6_While_Do_while

fun main() {
    println("Таймер")
    print("Введите количество секунд: ")

    val seconds = readln().toIntOrNull() ?: run {
        return
    }

    println("Таймер запущен на $seconds секунд...")
    Thread.sleep(seconds * 1000L)
    println("Прошло $seconds секунд")
}