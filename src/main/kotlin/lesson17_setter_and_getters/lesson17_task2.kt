package org.example.lesson17_setter_and_getters

class Ship(
    private val name: String,
    private var averageSpeed: Double,
    private val homePort: String,
) {

    var shipName: String
        get() = name
        set(value) {
            println("Нельзя изменить название корабля")
        }

    override fun toString(): String {
        return "Корабль $name (скорость: $averageSpeed узлов, порт: $homePort)"
    }
}

fun main() {
    val ship = Ship("Буревестник", 22.0, "Владивосток")
    println(ship)

    ship.shipName = "Новый корабль"
    println(ship)
}
