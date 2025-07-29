package org.example.Lesson7_For_Ranges

fun main() {
    val password = buildString {
        for (i in 0 until  6) {
            append(
                if (i % 2 == 0) ('a'..'z').random()
                else (0..9).random()
            )
        }
    }

    println("Сгенерированный пароль: $password")
}