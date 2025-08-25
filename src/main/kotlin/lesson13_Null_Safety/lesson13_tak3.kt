package org.example.lesson13_Null_Safety

class AddressBookContact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
)

fun AddressBookContact.printInfo() {
    println(
        "Имя: $name, Номер телефона: $phoneNumber, Компания: ${company ?: "Не указана"}"
    )
}

fun main() {
    val contacts = listOf(
        AddressBookContact("Александр", 79001234567, "Google"),
        AddressBookContact("Екатерина", 79118765432, null),
        AddressBookContact("Максим", 79222222222, "null"),
        AddressBookContact("Ольга", 79333333333, null),
        AddressBookContact("Дмитрий", 79444444444, "Yandex")
    )

    val companies = contacts.mapNotNull { it.company }

    println("Список компаний в телефонной книге:")
    if (companies.isEmpty()) {
        println("Компаний нет.")
    } else {
        for (company in companies) {
            println("- $company")
        }
    }
}