package org.example.Lesson8_Arrays

fun main() {

    print("Введите количество ингредиентов: ")
    val count = readln().toInt()

    val ingredients = Array<String>(count) { "" }

    for (i in 0 until count) {
        print("Введите ингредиент №${i + 1}: ")
        ingredients[i] = readln()
    }

    println("\nПолученные ингредиенты:")
    println(ingredients.joinToString(", "))
}