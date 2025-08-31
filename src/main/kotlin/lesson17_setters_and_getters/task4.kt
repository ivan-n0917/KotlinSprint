package org.example.lesson17_setters_and_getters

class Package(
    private val packageId: String,
    private var location: String,
    private var moveCount: Int = 0,
) {

    var locationProperty: String = ""
        get() = location
        set(newLocation) {
            if (newLocation.isNotBlank() && newLocation != field) {
                field = newLocation
                moveCount++
                println("Посылка $packageId прибыла в '$newLocation'. Перемещений: $moveCount")
            } else {
                println("Новое местоположение не может быть пустым или совпадать с текущим.")
            }
        }


    val moveCountProperty: Int
        get() = moveCount
}

fun main() {
    val package1 = Package("PKG-12345", "Москва")

    println("Исходное местоположение: ${package1.locationProperty}")
    println("Количество перемещений: ${package1.moveCountProperty}")

    package1.locationProperty = "Санкт-Петербург"
    package1.locationProperty = "Екатеринбург"
    package1.locationProperty = "Казань"

}