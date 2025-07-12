package org.example.Lesson5_if_else_when

fun main() {
    print("Введите расстояние поездки в км: ")
    val distance = readln().toDouble()

    print("Введите расход топлива на 100 км: ")
    val consumption = readln().toDouble()

    print("Введите цену за литр топлива: ")
    val price = readln().toDouble()

    val fuel = (distance * consumption) / 100
    val cost = fuel * price

    println("Необходимо топлива: ${"%.2f".format(fuel)} л")
    println("Стоимость поездки: ${"%.2f".format(cost)} руб")
}


