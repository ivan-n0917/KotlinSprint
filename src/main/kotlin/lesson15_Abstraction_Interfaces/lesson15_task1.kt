package org.example.lesson15_Abstraction_Interfaces


interface Flyable {
    fun fly()
}

interface Swimmable {
    fun swim()
}

class Fish : Swimmable {
    override fun swim() {
        println("Карась плывёт под водой.")
    }
}

class Gull : Flyable {
    override fun fly() {
        println("Чайка парит над морем.")
    }
}

class Duck : Flyable, Swimmable {
    override fun fly() {
        println("Утка летит над прудом.")
    }

    override fun swim() {
        println("Утка плавает на поверхности воды.")
    }
}

fun main() {
    val fish = Fish()
    val gull = Gull()
    val duck = Duck()

    fish.swim()
    gull.fly()
    duck.fly()
    duck.swim()
}