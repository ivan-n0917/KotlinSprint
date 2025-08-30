package lesson17_setters_and_getters

class Folder(
    private val name: String,
    private var fileCount: Int,
    private val isSecret: Boolean,
) {

    fun getName(): String {
        return if (isSecret) "скрытая папка" else name
    }

    fun getFileCount(): Int {
        return if (isSecret) 0 else fileCount
    }
}

fun main() {

    val secretFolder = Folder("Документы", 5, true)

    println("Имя папки: ${secretFolder.getName()}")      // Ожидаем: "скрытая папка"
    println("Количество файлов: ${secretFolder.getFileCount()}")  // Ожидаем: 0

    val regularFolder = Folder("Фото", 20, false)

    println("Имя папки: ${regularFolder.getName()}")     // Ожидаем: "Фото"
    println("Количество файлов: ${regularFolder.getFileCount()}")  // Ожидаем: 20
}