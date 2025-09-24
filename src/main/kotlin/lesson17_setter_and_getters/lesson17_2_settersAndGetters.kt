package org.example.lesson17_setter_and_getters

class Ship(
    private val name: String,
    var averageSpeed: Double,
    val port: String,
) {

    var shipName: String
        get() = name
        set(value) {
            println("Предупреждение: Вы не можете изменять имя корабля '$name' на '$value'.")
        }
}

fun main() {
    val myShip = Ship("Лазурный", 15.0, "Бразилия")

    println("Имя корабля: ${myShip.shipName}")
    println("Скорость: ${myShip.averageSpeed} узлов")
    println("Порт: ${myShip.port}")

    myShip.shipName = "Балтик"

}