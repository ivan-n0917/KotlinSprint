package org.example.lesson18_Polymorphism

open class Animal(
    open val name: String,
) {
    open fun eat() {
        println("$name -> ест")
    }

    open fun sleep() {
        println("$name -> спит")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест кости")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}

fun main() {

    val fox = Fox("Рыжик")
    val dog = Dog("Бобик")
    val cat = Cat("Мурка")

    val animals: List<Animal> = listOf(fox, dog, cat)

    for (animal in animals) {
        animal.eat()
    }
}