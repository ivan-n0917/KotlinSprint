package org.example.Lesson3

fun main() {

    val from = "E2"
    val to = "E4"
    val thePlayerWalks = "1 ход"
    val makeAbove = "$from-$to: $thePlayerWalks"

    println(makeAbove)

    val newFrom = "D2"
    val newTo = "D3"
    val thePlayerWalks2 = "2 ход"
    val newMakeAbove = "$newFrom-$newTo: $thePlayerWalks2"

    println(newMakeAbove)
}