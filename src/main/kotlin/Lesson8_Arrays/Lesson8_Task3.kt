package org.example.Lesson8_Arrays

fun main() {
    val ingredients = arrayOf("Фарш", "Сыр", "Тесто", "Майонез")
    print("Введите название ингредиента: ")
    val search = readln()

    println(
        when (search in ingredients) {
            true -> "Ингредиент [$search] найден"
            false -> "Ингредиент [$search] не найден"
        }
    )
}