package org.example.Lists

fun main() {

    val ingredientsPerPortion = listOf(2, 50, 15)

    println("Введите количество порций омлета:")
    val portions = readln().toInt()

    val eggs = ingredientsPerPortion[0] * portions
    val milk = ingredientsPerPortion[1] * portions
    val butter = ingredientsPerPortion[2] * portions

    println(
        "На $portions порций вам понадобится: " +
                "Яиц – $eggs, молока – ${milk} мл, сливочного масла – ${butter} гр"
    )
}