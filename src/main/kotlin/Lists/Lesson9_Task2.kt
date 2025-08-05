package org.example.Lists

fun main() {

    val baseIngredients = listOf("мука", "яйца", "молоко")

    println("В рецепте есть базовые ингредиенты: $baseIngredients")
    println("Желаете добавить еще?")

    val answer = readln()

    if (answer.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln().trim()

        val allIngredients = baseIngredients.toMutableList()
        allIngredients.add(newIngredient)

        println("Теперь в рецепте есть следующие ингредиенты: $allIngredients")
    }
}
