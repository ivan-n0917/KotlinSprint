package org.example.lesson17_setters_and_getters

class Ship(
    private val name: String,
    private var averageSpeed: Int,
    private var homePort: String,
) {

    val nameProperty: String
        get() = name

    var averageSpeedProperty: Int
        get() = averageSpeed
        set(value) {
            if (value > 0) {
                averageSpeed = value
            } else {
                println("Ошибка: Скорость должна быть положительной.")
            }
        }

    var homePortProperty: String
        get() = homePort
        set(value) {
            homePort = value
        }
}

fun main() {
    val ship = Ship("Морской Волк", 25, "Санкт-Петербург")

    println("Имя корабля: ${ship.nameProperty}")
    println("Скорость: ${ship.averageSpeedProperty} узлов")
    println("Порт приписки: ${ship.homePortProperty}")

    ship.averageSpeedProperty = 30
    println("Новая скорость: ${ship.averageSpeedProperty} узлов")

    ship.homePortProperty = "Гданьск"
    println("Новый порт приписки: ${ship.homePortProperty}")
}