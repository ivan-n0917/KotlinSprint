package org.example.lesson15_Abstraction_Interfaces

abstract class WeatherStationStats {
    abstract fun getType(): String
    abstract fun getDetails(): String
}

class Temperature(private val value: Double) : WeatherStationStats() {
    override fun getType(): String = "Температура"
    override fun getDetails(): String = "Температура: $value°C"
}

class PrecipitationAmount(private val amount: Double) : WeatherStationStats() {
    override fun getType(): String = "Осадки"
    override fun getDetails(): String = "Количество осадков: $amount мм"
}

class WeatherServer {
    fun sendToServer(stats: WeatherStationStats) {
        println("Отправка данных на сервер...")
        println("Тип данных: ${stats.getType()}")
        println("Детали: ${stats.getDetails()}")
        println("Данные успешно отправлены.\n")
    }
}

fun main() {
    val temperature = Temperature(23.5)
    val precipitation = PrecipitationAmount(5.2)

    val server = WeatherServer()

    server.sendToServer(temperature)
    server.sendToServer(precipitation)
}

