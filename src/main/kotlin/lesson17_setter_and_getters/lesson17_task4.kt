package org.example.lesson17_setter_and_getters

class Order(val number: String, location: String) {
    var location = location
        set(value) {
            field = value
            moveCount++
        }
    private var moveCount = 0
    val moves: Int
        get() = moveCount
}

fun main() {
    val parcel = Order("12345", "Склад отправителя")

    listOf("Сортировочный центр", "Город назначения", "Пункт выдачи").forEach {
        parcel.location = it
        println("Посылка ${parcel.number} в ${parcel.location}, перемещений: ${parcel.moves}")
    }
}