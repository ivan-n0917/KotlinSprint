package org.example.Lesson9_Lists

fun main() {

    val ingredients = listOf("Помидор", "сыр", "яйца", "соль")

    println("В рецепте есть следующие ингредиенты: $ingredients")

    for (ingredient in ingredients) {
        println(ingredient)
    }
}
