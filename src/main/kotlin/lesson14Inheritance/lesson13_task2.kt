package org.example.lesson14Inheritance

open class Vessel(
    open val speed: Int = 30,
    open val capacity: Int = 500,
    open val canBreakIce: Boolean = false
) {
    open fun loadCargo() {
        println("Погрузка не определена для этого типа судна.")
    }

    fun printInfo() {
        println("  Скорость: $speed узлов")
        println("  Вместительность: $capacity пассажиров")
        println("  Может колоть лёд: ${if (canBreakIce) "Да" else "Нет"}")
    }
}

class PassengerVessel : Vessel(
    speed = 30,
    capacity = 500,
    canBreakIce = false
) {
    override fun loadCargo() {
        println("Лайнер выдвигает горизонтальный трап.")
    }
}

class CargoVessel : Vessel(
    speed = 20,
    capacity = 800,
    canBreakIce = false
) {
    override fun loadCargo() {
        println("Грузовое судно активирует погрузочный кран.")
    }
}

class IcebreakingVessel : Vessel(
    speed = 15,
    capacity = 300,
    canBreakIce = true
) {
    override fun loadCargo() {
        println("Ледокол открывает ворота со стороны кормы.")
    }
}

fun main() {
    val passengerVessel = PassengerVessel()
    val cargoVessel = CargoVessel()
    val icebreakingVessel = IcebreakingVessel()

    println("Лайнер")
    passengerVessel.loadCargo()
    passengerVessel.printInfo()

    println("\nГрузовое судно")
    cargoVessel.loadCargo()
    cargoVessel.printInfo()

    println("\nЛедокол")
    icebreakingVessel.loadCargo()
    icebreakingVessel.printInfo()
}