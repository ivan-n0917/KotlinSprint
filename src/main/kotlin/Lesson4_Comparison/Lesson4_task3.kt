package org.example.Lesson4_Comparison

const val REQUIRED_HUMIDITY = 20
const val WINTER_SEASON = "зима"

fun main() {

    val isSunnyWeather = true
    val isTentOpen = true
    val airHumidity = 20
    val currentSeason = "зима"


    val favorableConditions = isSunnyWeather &&
            isTentOpen &&
            airHumidity >= REQUIRED_HUMIDITY &&
            currentSeason != WINTER_SEASON


    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}