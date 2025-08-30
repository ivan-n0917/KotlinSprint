package org.example.lesson16_encapsulation

class Order private constructor(val orderId: String, private var status: String) {
    companion object {
        fun create(orderId: String, initialStatus: String): Order {
            return Order(orderId, initialStatus)
        }
    }

    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun requestStatusChange(newStatus: String): Boolean {
        println("Обращение к менеджеру...")

        val validStatuses = listOf("В обработке", "Готов", "Доставлен", "Отменён")

        if (newStatus in validStatuses) {
            changeStatus(newStatus)
            println("Статус заказа изменён на: $newStatus")
            return true
        } else {
            println("Неверный статус. Изменение невозможно.")
            return false
        }
    }

    fun getCurrentStatus(): String = status
}

fun main() {
    val order = Order.create("ORD-12345", "В обработке")

    println("Исходный статус заказа: ${order.getCurrentStatus()}")

    val success = order.requestStatusChange("Готов")

    if (success) {
        println("Новый статус заказа: ${order.getCurrentStatus()}")
    } else {
        println("Статус не был изменён.")
    }

    order.requestStatusChange("Приготовлен")
}