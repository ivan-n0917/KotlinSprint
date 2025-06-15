package org.example.Lesson2

const val DEPARTURE_HOUR = 9
const val DEPARTURE_MINUTE = 39
const val TRAVEL_TIME_MINUTES = 457

fun main() {

    val totalMinutesFromMidnight = DEPARTURE_HOUR * 60 + DEPARTURE_MINUTE + TRAVEL_TIME_MINUTES
    val (arrivalHour, arrivalMinute) = totalMinutesFromMidnight.run {
        Pair(this / 60 % 24, this % 60)
    }

    println("Поезд прибудет в ${arrivalHour}:${"%02d".format(arrivalMinute)}")
}