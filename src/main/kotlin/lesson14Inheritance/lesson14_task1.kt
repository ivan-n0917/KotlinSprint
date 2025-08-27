package org.example.lesson14Inheritance

open class Liner(
    open val speed: Int = 30,
    open val capacity: Int = 500,
    open val canBreakIce: Boolean = false,
) {
    fun printInfo() {
        println("  Скорость: $speed узлов")
        println("  Вместительность: $capacity пассажиров")
        println("  Может колоть лёд: ${if (canBreakIce) "Да" else "Нет"}")
    }
}

class CargoShip : Liner(
    speed = 20,
    capacity = 200,
    canBreakIce = false
)

class Icebreaker : Liner(
    speed = 15,
    capacity = 300,
    canBreakIce = true
)

fun main() {
    val liner = Liner()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()

    println("Лайнер:")
    liner.printInfo()

    println("\nГрузовое судно:")
    cargoShip.printInfo()

    println("\nЛедокол:")
    icebreaker.printInfo()
}