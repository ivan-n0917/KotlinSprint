package org.example.Lesson2

fun main() {

    val englishLanguageScores = listOf(3, 4, 3, 5)

    val numberOfStudents = englishLanguageScores.size

    val totalScoresSum = englishLanguageScores.sum().toFloat()

    val averageScore = totalScoresSum / numberOfStudents

    println("Средний балл по английскому языку: %.2f".format(averageScore))
}
