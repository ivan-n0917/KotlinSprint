package org.example.Lesson2

const val BASE_CRYSTAL = 7
const val BASE_IRON = 11
const val BUFF_PERCENT = 20

fun main() {

    fun calculateBonus(base: Int) = (base * BUFF_PERCENT / 100).toInt()

    println("Бонусные кристаллические руды: ${calculateBonus(BASE_CRYSTAL)}")
    println("Бонусные железные руды: ${calculateBonus(BASE_IRON)}")
}