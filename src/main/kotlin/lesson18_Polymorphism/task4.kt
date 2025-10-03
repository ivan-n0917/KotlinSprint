package org.example.lesson18_Polymorphism

abstract class Package {
    abstract fun surfaceArea(): Double
}

class RectangularPackage(
    private val length: Double,
    private val width: Double,
    private val height: Double,
) : Package() {
    override fun surfaceArea(): Double {
        return 2 * (length * width + width * height + height * length)
    }
}

class CubePackage(private val edge: Double) : Package() {
    override fun surfaceArea(): Double {
        return 6 * edge * edge
    }
}

fun main() {

    val box1 = RectangularPackage(2.0, 3.0, 4.0)
    val box2 = CubePackage(5.0)

    val packages: List<Package> = listOf(box1, box2)

    for (pkg in packages) {
        println("Площадь поверхности посылки: ${pkg.surfaceArea()}")
    }
}