package org.example.lesson12_Construktors

const val KELVIN_TO_CELSIUS = -273

class TheWeatherDayV3(
    kelvinDayTemp: Int,
    kelvinNightTemp: Int,
    hasRain: Boolean,
) {
    private val dayTempKelvin = kelvinDayTemp
    private val nightTempKelvin = kelvinNightTemp

    private val dayTemp: Int
        get() = dayTempKelvin + KELVIN_TO_CELSIUS

    private val nightTemp: Int
        get() = nightTempKelvin + KELVIN_TO_CELSIUS

    init {
        val rainText = if (hasRain) "Да" else "Нет"
        println("Погода за сегодня:")
        println("Дневная температура: $dayTemp°C")
        println("Ночная температура: $nightTemp°C")
        println("Осадки: $rainText")
        println()
    }
}

fun main() {

    TheWeatherDayV3(
        kelvinDayTemp = 298,
        kelvinNightTemp = 291,
        hasRain = true
    )
}