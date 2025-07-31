package org.example.Lists

fun main() {
    fun ingredients() = listOf("Помидор", "сыр", "яйца", "соль")
    println("В рецепте есть следующие ингредиенты: ${ingredients()}")

    for (i in ingredients()) {
        println(i)
    }
}