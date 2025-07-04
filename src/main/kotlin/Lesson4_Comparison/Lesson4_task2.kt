package org.example.Lesson4_Comparison

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {

    val weight1 = 20
    val volume1 = 80

    println("Груз с весом $weight1 кг и объемом $volume1 л соответствует категории 'Average': " +
            "${weight1 > MIN_WEIGHT && weight1 <= MAX_WEIGHT && volume1 < MAX_VOLUME}")

    val weight2 = 50
    val volume2 = 100

    println("Груз с весом $weight2 кг и объемом $volume2 л соответствует категории 'Average': " +
            "${weight2 > MIN_WEIGHT && weight2 <= MAX_WEIGHT && volume2 < MAX_VOLUME}")
}