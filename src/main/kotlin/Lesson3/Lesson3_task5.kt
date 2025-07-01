package org.example.Lesson3

fun main() {

    val thePlayerWalks = "D2-D4;0"

    val parts = thePlayerWalks.split("-", ";")

    val from = parts[0]
    val to = parts[1]
    val moveNumber = parts[2].toInt()

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $moveNumber")
}