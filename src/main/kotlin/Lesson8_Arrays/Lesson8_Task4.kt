package org.example.Lesson8_Arrays

fun main() {
    val ingredients = mutableListOf("Мука", "Сахар", "Яйца", "Молоко", "Масло")
    println("Список ингредиентов: ${ingredients.joinToString()}")

    print("Какой ингредиент заменить? ")
    val oldItem = readln()

    val index = ingredients.indexOf(oldItem)
    if (index == -1) {
        println("'$oldItem' нет в списке")

    }

    print("На что заменить? ")
    ingredients[index] = readln()

    println("Готово! Новый список: ${ingredients.joinToString()}")
}
