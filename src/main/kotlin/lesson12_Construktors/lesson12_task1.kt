package org.example.lesson12_Construktors

class WeatherDay {
    var dayTemp: Int = 0
    var nightTemp: Int = 0
    var hasRain: Boolean = false

    fun printInfo() {
        val rainText = if (hasRain) "Да" else "Нет"
        println("Дневная температура: $dayTemp°C")
        println("Ночная температура: $nightTemp°C")
        println("Осадки: $rainText")
        println()
    }
}

fun main() {

    val day1 = WeatherDay()
    val day2 = WeatherDay()

    day1.dayTemp = 25
    day1.nightTemp = 18
    day1.hasRain = true

    day2.dayTemp = 30
    day2.nightTemp = 20
    day2.hasRain = false

    println("Погода в первый день:")
    day1.printInfo()

    println("Погода во второй день:")
    day2.printInfo()
}