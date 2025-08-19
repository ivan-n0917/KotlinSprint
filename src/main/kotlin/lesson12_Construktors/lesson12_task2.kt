package org.example.lesson12_Construktors

class   TheWeatherDay(
    var dayTemp: Int,
    var nightTemp: Int,
    var hasRain: Boolean,
) {
    fun printInfo() {
        val rainText = if (hasRain) "Да" else "Нет"
        println("Дневная температура: $dayTemp°C")
        println("Ночная температура: $nightTemp°C")
        println("Осадки: $rainText")
        println()
    }
}

fun main() {

    val weather = TheWeatherDay(
        dayTemp = 22,
        nightTemp = 15,
        hasRain = true
    )

    println("Погода за сегодня:")
    weather.printInfo()
}