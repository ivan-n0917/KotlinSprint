package org.example.lesson17_setters_and_getters

class Ship(
    private val name: String,
    private var averageSpeed: Int,
    private var homePort: String,
) {

    fun getName(): String = name

    fun getAverageSpeed(): Int = averageSpeed
    fun setAverageSpeed(newSpeed: Int) {
        if (newSpeed > 0) {
            averageSpeed = newSpeed
        } else {
            println("Ошибка: Скорость должна быть положительной.")
        }
    }

    fun getHomePort(): String = homePort
    fun setHomePort(newPort: String) {
        homePort = newPort
    }
}

fun main() {
    val ship = Ship("Морской Волк", 25, "Санкт-Петербург")

    println("Имя корабля: ${ship.getName()}")
    println("Скорость: ${ship.getAverageSpeed()} узлов")
    println("Порт приписки: ${ship.getHomePort()}")

    ship.setAverageSpeed(30)
    println("Новая скорость: ${ship.getAverageSpeed()} узлов")

    ship.setHomePort("Гданьск")
    println("Новый порт приписки: ${ship.getHomePort()}")
}