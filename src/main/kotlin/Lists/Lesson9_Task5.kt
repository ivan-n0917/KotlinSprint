package org.example.Lists

fun main() {
    val ingredients = mutableSetOf<String>()

    println("Введите 5 ингредиентов (по одному):")
    repeat(5) {
        print("Ингредиент ${it + 1}: ")
        ingredients.add(readln().trim().lowercase())
    }

    val sortedIngredients = ingredients.sorted()

    val formattedOutput = sortedIngredients.joinToString(", ")
        .replaceFirstChar { it.uppercase() }

    println("Итоговый список ингредиентов:")
    println(formattedOutput)
}