package org.example.Lesson1

const val SECONDS_IN_MINUTE = 60
const val MINUTE_IN_HOUR = 60
const val SECONDS_IN_HOUR = SECONDS_IN_MINUTE * MINUTE_IN_HOUR

fun duration(totalSeconds: Int): String {
    val hours = totalSeconds / SECONDS_IN_HOUR
    val secondsAfterHours = totalSeconds % SECONDS_IN_HOUR
    val minutes = secondsAfterHours / SECONDS_IN_MINUTE
    val secunds = secondsAfterHours % SECONDS_IN_MINUTE

    return "02d:02d:02d".format(hours,minutes,secunds)
}
    fun main() {
        fun totalSeconds = 6480
        println("Время вкосмосе: ${duration(totalSeconds())}")
    }