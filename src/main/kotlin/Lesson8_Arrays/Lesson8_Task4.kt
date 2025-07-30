package org.example.Lesson8_Arrays

fun main() {
    val ingredients = mutableListOf("Мука", "Сахар", "Яйца", "Молоко", "Масло")

    println("Список ингредиентов: ${ingredients.joinToString()}")

    print("Какой ингредиент заменить? ")
    val oldItem = readln()

    if (oldItem !in ingredients) {
        println("'$oldItem' нет в списке")
        return
    }

    print("На что заменить? ")
    ingredients[ingredients.indexOf(oldItem)] = readln()

    println("Готово! Новый список: ${ingredients.joinToString()}")
}