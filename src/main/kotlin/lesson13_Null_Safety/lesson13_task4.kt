package org.example.lesson13_Null_Safety

class phoneEntry(
    private val name: String,
    private val phoneNumber: Long,
    private val company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name, Номер телефона: $phoneNumber, Компания: ${company ?: "Не указана"}")
    }
}

fun main() {
    val contacts = mutableListOf<PhoneEntry>()

    while (true) {
        println("\nВведите имя (или 'exit' для выхода):")
        val inputName = readln().trim()

        if (inputName == "exit") break

        println("Введите номер телефона:")
        val inputPhone = readln().trim()

        val phoneNumber = inputPhone.toLongOrNull()

        if (phoneNumber == null) {
            println("Неверный формат номера. Контакт не будет добавлен.")
            continue
        }

        println("Введите название компании (оставьте пустым, если не указана):")
        val inputCompany = readln().trim()
        val company = inputCompany.ifEmpty { null }

        contacts.add(PhoneEntry(inputName, phoneNumber, company))
        println("Контакт успешно добавлен!")
    }

    println("\nСписок контактов в телефонной книге:")
    for (contact in contacts) {
        contact.printInfo()
    }
}