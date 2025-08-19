package org.example.lesson12_Construktors

const val KELVIN_TO_CELSIUS = -273

class TheWeatherDayV3(
    kelvinDayTemp: Int,
    kelvinNightTemp: Int,
    hasRain: Boolean
) {
    private val dayTempKelvin = kelvinDayTemp
    private val nightTempKelvin = kelvinNightTemp
    private val hasRainValue = hasRain

    val dayTemp: Int
        get() = dayTempKelvin + KELVIN_TO_CELSIUS

    val nightTemp: Int
        get() = nightTempKelvin + KELVIN_TO_CELSIUS

    val hasRain: Boolean
        get() = hasRainValue
}

fun main() {

    val days = (1..30).map { day ->
        TheWeatherDayV3(
            kelvinDayTemp = (285..305).random(),   // ~12°C до 32°C
            kelvinNightTemp = (275..295).random(), // ~2°C до 22°C
            hasRain = (0..1).random() == 1         // 50% шанс осадков
        )
    }

    val dayTemps = days.map { it.dayTemp }
    val nightTemps = days.map { it.nightTemp }

    val rainyDays = days.count { it.hasRain }

    val avgDayTemp = dayTemps.average().toInt()
    val avgNightTemp = nightTemps.average().toInt()

    println("Статистика погоды за месяц:")
    println("Средняя дневная температура: $avgDayTemp°C")
    println("Средняя ночная температура: $avgNightTemp°C")
    println("Количество дней с осадками: $rainyDays")
}