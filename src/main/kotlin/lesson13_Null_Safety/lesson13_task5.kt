package org.example.lesson13_Null_Safety

class PhoneEntry(
    private val name: String,
    private val phoneNumber: Long,
    private val company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name")
        println("Телефон: $phoneNumber")
        println("Компания: ${company ?: "<не указана>"}")
        println()
    }
}

fun main() {
    try {
        println("Введите имя:")
        val name = readln().trim()

        println("Введите номер телефона:")
        val phoneInput = readln().trim()

        val phoneNumber = phoneInput.toLong()

        println("Введите название компании (оставьте пустым, если не указана):")
        val companyInput = readln().trim()
        val company = companyInput.ifEmpty { null }

        PhoneEntry(name, phoneNumber, company).also(block = PhoneEntry::printInfo)
    } catch (e: NumberFormatException) {

        println("Ошибка: Неверный формат номера. Ожидалось число.")
        println("Детали ошибки: ${e.javaClass.simpleName}")
    } catch (e: Exception) {

        println("Произошла непредвиденная ошибка: ${e.message}")
    }
}

