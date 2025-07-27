package org.example.Lesson7_For_Ranges

fun main() {
    print("Введите длину пароля (мин. 6): ")
    val length = readln().toIntOrNull()

    val password = length?.let { generatePassword(it) }
    println("Ваш пароль: $password")
}

fun generatePassword(length: Int): String {
    val chars = mutableListOf<Char>()
    val digits = '0'..'9'
    val lowerLetters = 'a'..'z'
    val upperLetters = 'A'..'Z'

    chars.add(digits.random())
    chars.add(lowerLetters.random())
    chars.add(upperLetters.random())

    val allChars = digits.toList() + lowerLetters.toList() + upperLetters.toList()
    repeat(length - 3) {
        chars.add(allChars.random())
    }
        return chars.shuffled().joinToString("")
    }


