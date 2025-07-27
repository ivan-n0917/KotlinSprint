package org.example.Lesson7_For_Ranges

fun main() {
    print("Введите число: ")
    val maxNumber = readln().toIntOrNull()

    val progression: IntProgression = 0..maxNumber!! step 2

    println("Чётные числа от 0 до $maxNumber:")
    progression.forEach { println(it) }
}