package org.example.Lists

fun main() {
    println("Введите 5 ингредиентов через запятую с пробелом (\", \"):")
    val input = readln()

    val ingredients = input.split(", ").map { it.trim() }

    val sortedIngredients = ingredients.sorted()

    println("Отсортированный список ингредиентов:")
    println(sortedIngredients)
}