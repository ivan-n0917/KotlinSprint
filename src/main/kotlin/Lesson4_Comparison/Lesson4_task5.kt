package org.example.Lesson4_Comparison

fun main() {

    print("Есть ли повреждения корпуса (true/false): ")

    val hasDamage = readln().toBoolean()

    print("Текущий состав экипажа: ")

    val crewCount = readln().toInt()

    print("Количество ящиков с провизией: ")

    val foodBoxes = readln().toInt()

    print("Благоприятны ли метеоусловия (true/false): ")

    val isWeatherGood = readln().toBoolean()

    val canSail: Boolean = (!hasDamage &&
            crewCount in 55..70 &&
            foodBoxes > 50) || (hasDamage && !hasDamage &&
            crewCount == 70 && isWeatherGood && foodBoxes >= 50)


    println("\nКорабль ${if (canSail) "может" else "не может"} отправиться в плавание")
}