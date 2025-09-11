package org.example.lesson17_setter_and_getters

class Folder(
    val name: String,
    private var count: Int,
    private val secret: Boolean = false,
) {

    val shownName: String
        get() = if (secret) "скрытая папка: количество файлов 0" else name

    val shownCount: Int
        get() = if (secret) 0 else count
}

fun main() {
    print("Введите номер папки: ")
    val name = readln()

    val folder = Folder(name, 8)

    print("\nВыберите действие:\n1 - Показать статус\n2 - Показать количество файлов\nВаш выбор: ")
    val choice = readln().trim()

    when (choice) {
        "1" -> println(folder.shownName)
        "2" -> println("Файлов: ${folder.shownCount}")
        else -> println("Неверный выбор.")
    }
}

