package org.example.lesson17_setter_and_getters

class Folder(
    name: String,
    count: Int,
    private var secret: Boolean = false,
) {

    val name: String = name
        get() = if (secret) "" else field

    private val count: Int = count
        get() = if (secret) 0 else field

    fun makeSecret() {
        this.secret = true
    }

    fun makePublic() {
        this.secret = false
    }

    override fun toString(): String {
        return "Папка: $name файлов: $count, секретная: $secret"
    }
}

fun main() {

    val secretFolder = Folder("Секретные документы", 42, true)

    val normalFolder = Folder("Обычные файлы", 15, false)

    println(secretFolder)

    println(normalFolder)
}