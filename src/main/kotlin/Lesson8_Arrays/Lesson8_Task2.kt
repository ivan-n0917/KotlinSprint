package org.example.Lesson8_Arrays

fun main() {
    val ingredients = arrayOf("Фарш", "Сыр", "Тесто", "Майонез")
    print("Введите название ингредиента для поиска: ")
    val searchIngredient = readln()
    var found = false

    for (ingredient in ingredients) {
        if (searchIngredient == ingredient) {
            found = true
            println("Ингредиент [$searchIngredient] найден")
            break
        }
    }
    if (!found) {
        println("Ингредиент [$searchIngredient] не найден")
    }
}