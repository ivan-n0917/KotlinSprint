package org.example.lesson17_setters_and_getters

class Package(
    val packageId: String,
    private var location: String,
    private var moveCount: Int = 0,
) {

    fun getLocation(): String = location

    fun getMoveCount(): Int = moveCount

    fun setLocation(newLocation: String) {
        if (newLocation.isNotBlank() && newLocation != location) {
            location = newLocation
            moveCount++
            println("Посылка $packageId прибыла в '$newLocation'. Перемещений: $moveCount")
        } else {
            println("Новое местоположение не может быть пустым или совпадать с текущим.")
        }
    }
}

fun main() {
    val package1 = Package("PKG-12345", "Москва")

    println("Исходное местоположение: ${package1.getLocation()}")
    println("Количество перемещений: ${package1.getMoveCount()}")

    package1.setLocation("Санкт-Петербург")
    package1.setLocation("Екатеринбург")
    package1.setLocation("Казань")

}