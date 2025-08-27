package org.example.lesson14Inheritance

abstract class Figure(
    open val color: String
) {
    abstract fun getArea(): Double
    abstract fun getPerimeter(): Double
}

class Circle(
    override val color: String,
    private val radius: Double
) : Figure(color) {
    private val pi = 3.141592653589793

    override fun getArea(): Double = pi * radius * radius
    override fun getPerimeter(): Double = 2 * pi * radius
}

class Rectangle(
    override val color: String,
    private val width: Double,
    private val height: Double
) : Figure(color) {
    override fun getArea(): Double = width * height
    override fun getPerimeter(): Double = 2 * (width + height)
}

fun main() {

    val figures = listOf(
        Circle("black", 5.0),
        Rectangle("white", 4.0, 6.0),
        Circle("white", 3.0),
        Rectangle("black", 2.0, 8.0),
        Rectangle("white", 5.0, 5.0)
    )

    val blackPerimetersSum = figures
        .filter { it.color == "black" }
        .sumOf { it.getPerimeter() }

    val whiteAreasSum = figures
        .filter { it.color == "white" }
        .sumOf { it.getArea() }

    println("Сумма периметров черных фигур: $blackPerimetersSum")
    println("Сумма площадей белых фигур: $whiteAreasSum")
}