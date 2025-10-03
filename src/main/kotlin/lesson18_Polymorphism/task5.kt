package org.example.lesson18_Polymorphism

class Screen {

    fun <T : Number> draw(shape: Circle, x: T, y: T): String {
        val xStr = formatCoordinate(x)
        val yStr = formatCoordinate(y)
        return "Нарисован круг в координатах (x=$xStr, y=$yStr)"
    }

    fun <T : Number> draw(shape: Square, x: T, y: T): String {
        val xStr = formatCoordinate(x)
        val yStr = formatCoordinate(y)
        return "Нарисован квадрат в координатах (x=$xStr, y=$yStr)"
    }

    fun <T : Number> draw(shape: Point, x: T, y: T): String {
        val xStr = formatCoordinate(x)
        val yStr = formatCoordinate(y)
        return "Нарисована точка в координатах (x=$xStr, y=$yStr)"
    }

    private fun formatCoordinate(coord: Number): String {
        return when (coord) {
            is Float -> "%.1f".format(coord)
            else -> coord.toString()
        }
    }
}

class Circle(val radius: Int)
class Square(val side: Int)
class Point

fun main() {
    val screen = Screen()

    val circle = Circle(10)
    val square = Square(15)
    val point = Point()

    println(screen.draw(circle, 5, 5))
    println(screen.draw(square, 10.5f, 8.7f))
    println(screen.draw(point, 15.0f, 20.0f))
}