package org.example.lesson16_Incapsulation

class Dice {
    private val faceValue: Int = (1..6).random()

    fun printResult() {
        println("На кубике выпало число: $faceValue")
    }
}

fun main() {
    val dice = Dice()
    dice.printResult()
}