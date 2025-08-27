package org.example.lesson14Inheritance

abstract class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isLandingPossible: Boolean,
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isLandingPossible: Boolean,
) : CelestialBody(name, hasAtmosphere, isLandingPossible) {
    private val moons = mutableListOf<Moon>()

    fun addMoon(moon: Moon) {
        moons.add(moon)
    }

    fun printInfo() {
        println("Планета: $name")
        if (moons.isNotEmpty()) {
            println("Спутники:")
            for (moon in moons) {
                println("- ${moon.name}")
            }
        } else {
            println("Нет спутников.")
        }
    }
}

class Moon(
    name: String,
    hasAtmosphere: Boolean,
    isLandingPossible: Boolean,
) : CelestialBody(name, hasAtmosphere, isLandingPossible)

fun main() {

    val moon1 = Moon("Луна-1", false, true)
    val moon2 = Moon("Луна-2", true, false)

    val planet = Planet("Земля-альтернатива", true, true)
    planet.addMoon(moon1)
    planet.addMoon(moon2)

    planet.printInfo()
}