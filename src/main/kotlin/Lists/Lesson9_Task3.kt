package org.example.Lists

fun main() {

    val ingredientsPerPortion = listOf(2, 50, 15)

    println("Введите количество порций омлета:")
    val portions = readln().toInt()

    val calculatedIngredients = ingredientsPerPortion.map { it * portions }

    println("На $portions порций вам понадобится: " +
            "Яиц – ${calculatedIngredients[0]}, " +
            "молока – ${calculatedIngredients[1]} мл, " +
            "сливочного масла – ${calculatedIngredients[2]} гр")
}