package org.example.lesson18_Polymorphism

import kotlin.random.Random

open class Dice(val sides: Int) {
    open fun roll() {
    }
}

class D4 : Dice(4) {
    override fun roll() {
        val result = Random.nextInt(1, sides + 1)
        println("Брошена D4, результат: $result")
    }
}

class D6 : Dice(6) {
    override fun roll() {
        val result = Random.nextInt(1, sides + 1)
        println("Брошена D6, результат: $result")
    }
}

class D8 : Dice(8) {
    override fun roll() {
        val result = Random.nextInt(1, sides + 1)
        println("Брошена D8, результат: $result")
    }
}

fun main() {

    val d4 = D4()
    val d6 = D6()
    val d8 = D8()

    val diceList: List<Dice> = listOf(d4, d6, d8)

    for (dice in diceList) {
        dice.roll()
    }
}