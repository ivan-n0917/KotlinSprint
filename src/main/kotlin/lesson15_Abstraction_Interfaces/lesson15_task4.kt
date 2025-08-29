package org.example.lesson15_Abstraction_Interfaces

abstract class Product(
    val name: String,
    var quantity: Int,
)

interface Searchable {
    fun search()
}

class Instrument(name: String, quantity: Int) : Product(name, quantity), Searchable {
    override fun search() {
        println("Выполняется поиск комплектующих для $name...")
    }
}

class Accessory(name: String, quantity: Int) : Product(name, quantity)

fun main() {

    val guitar = Instrument("Гитара", 5)
    val strings = Accessory("Струны", 24)
    val drums = Instrument("Барабаны", 3)
    val drumsticks = Accessory("Барабанные палочки", 16)

    guitar.search()
    drums.search()

    println("Товары на складе :")
    println("${guitar.name}: $${guitar.quantity} шт.")
    println("${strings.name}: $${strings.quantity} шт.")
    println("${drums.name}: $${drums.quantity} шт.")
    println("${drumsticks.name}: $${drumsticks.quantity} шт.")
}
