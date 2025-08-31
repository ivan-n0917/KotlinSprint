package lesson17_setters_and_getters

class Folder(
    private val name: String,
    private var fileCount: Int,
    private val isSecret: Boolean
) {

    val nameProperty: String
        get() = if (isSecret) "скрытая папка" else name

    val fileCountProperty: Int
        get() = if (isSecret) 0 else fileCount
}

fun main() {
    val secretFolder = Folder("Документы", 5, true)

    println("Имя папки: ${secretFolder.nameProperty}")      // Ожидаем: "скрытая папка"
    println("Количество файлов: ${secretFolder.fileCountProperty}")  // Ожидаем: 0

    val regularFolder = Folder("Фото", 20, false)

    println("Имя папки: ${regularFolder.nameProperty}")     // Ожидаем: "Фото"
    println("Количество файлов: ${regularFolder.fileCountProperty}")  // Ожидаем: 20
}