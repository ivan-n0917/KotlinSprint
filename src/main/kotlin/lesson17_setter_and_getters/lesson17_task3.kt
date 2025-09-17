package org.example.lesson17_setter_and_getters

class Folder(
    name: String,
    count: Int,
    private val isSecret: Boolean,
) {

    val originalName = name
        get() = if (isSecret) "скрытая папка" else field

    val originalCount = count
}

fun main() {
    print("Введите номер папки: ")
    val name = readln()

    val folder = Folder(
        name, 8,
        isSecret = true
    )

    print("\nВыберите действие:\n1 - Показать статус\n2 - Показать количество файлов\nВаш выбор: ")
    val choice = readln().trim()

    when (choice) {
        "1" -> println(folder.originalName)
        "2" -> println("Файлов: ${folder.originalCount}")
        else -> println("Неверный выбор.")
    }
}

