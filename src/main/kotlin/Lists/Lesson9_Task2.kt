package org.example.Lists

fun main() {
    val ingredients = mutableListOf("Помидор", "сыр", "яйца")

    println("В рецепте есть базовые ингредиенты: $ingredients")
    println("Желаете добавить еще?")

    val answer = readlnOrNull()

    if (answer?.equals("да", ignoreCase = true) == true) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()
        ingredients.add(newIngredient)
    }
}