package org.example.Lesson4_Comparison

const val MIN_CREW = 55
const val MAX_CREW = 70
const val RECOMMENDED_CREW = 70
const val MIN_PROVISIONS_MAIN_CASE = 50
const val MIN_PROVISIONS_ALTERNATIVE = 50

fun main() {

    print("Есть ли повреждения корпуса (true/false): ")
    val hasDamage = readln().toBoolean()

    print("Текущий состав экипажа: ")
    val crewCount = readln().toInt()

    print("Количество ящиков с провизией: ")
    val foodBoxes = readln().toInt()

    print("Благоприятны ли метеоусловия (true/false): ")
    val isWeatherGood = readln().toBoolean()

    val canSail = when {

        !hasDamage && crewCount in MIN_CREW..MAX_CREW && foodBoxes > MIN_PROVISIONS_MAIN_CASE -> true

        hasDamage && crewCount == RECOMMENDED_CREW && isWeatherGood && foodBoxes >= MIN_PROVISIONS_ALTERNATIVE -> true

        else -> false
    }

    println("\nКорабль ${if (canSail) "может" else "не может"} отправиться в плавание")
}
