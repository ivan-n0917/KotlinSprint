package org.example.lesson18_Polymorphism

import kotlin.random.Random

open class Dice {
    open val sides: Int = 0
    open fun roll() {
        println("Брошен кубик с $sides гранями")
    }
}

class D4 : Dice() {
    override val sides: Int = 4
    override fun roll() {
        val result = Random.nextInt(1, sides + 1)
        println("Брошен D4, результат: $result")
    }
}

class D6 : Dice() {
    override val sides: Int = 6
    override fun roll() {
        val result = Random.nextInt(1, sides + 1)
        println("Брошен D6, результат: $result")
    }
}

class D8 : Dice() {
    override val sides: Int = 8
    override fun roll() {
        val result = Random.nextInt(1, sides + 1)
        println("Брошен D8, результат: $result")
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