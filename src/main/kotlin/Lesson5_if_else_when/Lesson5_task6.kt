package org.example.Lesson5_if_else_when

fun main() {

    print("Введите ваш вес в килограммах: ")
    val weight = readln().toDouble()

    print("Введите ваш рост в сантиметрах: ")
    val heightCm = readln().toDouble()

    val heightM = heightCm / 100

    val bmi = weight / (heightM * heightM)
    println("Ваш индекс массы тела: $bmi")

    when {
        bmi < 18.5 -> println("Недостаточная масса тела")
        bmi < 25 -> println("Нормальная масса тела")
        bmi < 30 -> println("Избыточная масса тела")
        else -> println("Ожирение")
    }
}


