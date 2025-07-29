package org.example.Lesson8_Arrays

fun main() {
    val ingredients = arrayOf("Фарш", "Сыр", "Тесто", "Майонез")
    print("Введите название ингредиента: ")
    val search = readln()

    val message = if (ingredients.any { it.equals(search, true) }) {
        "Ингредиент [$search] найден"
    } else {
        "Ингредиент [$search] не найден"
    }

    println(message)
}