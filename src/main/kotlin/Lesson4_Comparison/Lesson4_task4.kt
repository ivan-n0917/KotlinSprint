package org.example.Lesson4_Comparison

fun main() {
    val trainingDay = 5

    val handDay = trainingDay % 2 == 1
    val pressDay = handDay
    val footDay = !handDay
    val backDay = footDay

    println(
        """
        Упражнения для рук:    $handDay
        Упражнения для ног:    $footDay
        Упражнения для спины:  $backDay
        Упражнения для пресса: $pressDay
        """.trimIndent()
    )
}