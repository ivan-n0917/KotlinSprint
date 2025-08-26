package org.example.lesson13_Null_Safety

class PhoneContact(
    private val name: String,
    private val phoneNumber: Long,
    private val company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {

    val contact1 = PhoneContact("Ростислав", 891234567896, "Reddit")

    val contact2 = PhoneContact("Анастасия", 890012345679)

    contact1.printInfo()
    contact2.printInfo()
}