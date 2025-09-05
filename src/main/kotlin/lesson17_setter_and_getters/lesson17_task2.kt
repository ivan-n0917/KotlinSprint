package org.example.lesson17_setter_and_getters

class Ship(
    val name: String,
    private var averageSpeed: Double,
    private var homePort: String,
) {

    var speed: Double
        get() = averageSpeed
        set(value) {
            averageSpeed = value
        }

    fun renameAttempt(newName: String) =
        println("Предупреждение: Имя $name нельзя изменить на $newName")

    override fun toString() =
        "Корабль '$name' ($averageSpeed узлов) - $homePort"
}

fun main() {
    val ship = Ship("Лазурный", 15.0, "Бразилия")

    println(ship.toString())

    ship.renameAttempt("Балтик")
}