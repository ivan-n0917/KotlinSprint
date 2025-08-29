package org.example.lesson16_encapsulation

class Circle private constructor(private val radius: Double) {
    companion object {
        private const val PI = 3.14

        fun create(radius: Double): Circle {
            if (radius <= 0.0) throw IllegalArgumentException("Радиус должен быть положительным числом.")
            return Circle(radius)

        }
    }


    fun calculateCircumference(): Double = 2 * PI * radius

    fun calculateArea(): Double = PI * radius * radius
}

fun main() {
    val circle = Circle.create(5.0)

    println("Длина окружности: ${circle.calculateCircumference()}")
    println("Площадь круга: ${circle.calculateArea()}")
}