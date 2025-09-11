package org.example

class Ship(
    val name: String,
    private var averageSpeed: Double,
    private val homePort: String
) {

    var speed: Double
        get() = averageSpeed
        set(value) {
            println("Предупреждение: Вы не можете изменять скорость корабля напрямую.")
        }

    fun renameAttempt(newName: String) =
        println("Предупреждение: Имя '$name' нельзя изменить на $newName")

    override fun toString() =
        "Корабль '$name' ($averageSpeed узлов) - $homePort"
}

fun main() {
    val ship = Ship("Лазурный", 15.0, "Бразилия")

    println(ship.toString())

    ship.speed = 20.0

    ship.renameAttempt("Балтик")
}