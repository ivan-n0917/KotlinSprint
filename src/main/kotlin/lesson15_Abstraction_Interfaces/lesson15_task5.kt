package org.example.lesson15_Abstraction_Interfaces

interface Movable {
    fun move()
}

interface PassengerCarrier {
    val maxPassengers: Int
    var currentPassengers: Int

    fun loadPassenger(): Boolean
    fun unloadPassenger(): Boolean
}

interface CargoCarrier {
    val maxCargoWeight: Double
    var currentCargoWeight: Double

    fun loadCargo(weight: Double): Boolean
    fun unloadCargo(weight: Double): Boolean
}

class Truck : Movable, PassengerCarrier, CargoCarrier {
    override val maxPassengers = 1
    override var currentPassengers = 0

    override val maxCargoWeight = 2.0
    override var currentCargoWeight = 0.0

    override fun loadPassenger(): Boolean {
        if (currentPassengers < maxPassengers) {
            currentPassengers++
            return true
        }
        println("Нельзя загрузить пассажира — грузовик переполнен.")
        return false
    }

    override fun unloadPassenger(): Boolean {
        if (currentPassengers > 0) {
            currentPassengers--
            return true
        }
        println("В грузовике нет пассажиров.")
        return false
    }

    override fun loadCargo(weight: Double): Boolean {
        if (currentCargoWeight + weight <= maxCargoWeight) {
            currentCargoWeight += weight
            return true
        }
        println("Нельзя загрузить $weight тонн — превышен допустимый вес ($maxCargoWeight т).")
        return false
    }

    override fun unloadCargo(weight: Double): Boolean {
        if (currentCargoWeight >= weight) {
            currentCargoWeight -= weight
            return true
        }
        println("Нельзя разгрузить $weight тонн — недостаточно груза.")
        return false
    }

    override fun move() {
        println("Грузовик перевозит $currentPassengers пассажиров и $currentCargoWeight тонн груза.")
    }
}

class Car : Movable, PassengerCarrier {
    override val maxPassengers = 2
    override var currentPassengers = 0

    override fun loadPassenger(): Boolean {
        if (currentPassengers < maxPassengers) {
            currentPassengers++
            return true
        }
        println("Нельзя загрузить пассажира — автомобиль переполнен.")
        return false
    }

    override fun unloadPassenger(): Boolean {
        if (currentPassengers > 0) {
            currentPassengers--
            return true
        }
        println("В автомобиле нет пассажиров.")
        return false
    }

    override fun move() {
        println("Автомобиль перевозит $currentPassengers пассажиров.")
    }
}

fun main() {

    val truck = Truck()
    val car1 = Car()
    val car2 = Car()

    repeat(1) { truck.loadPassenger() }
    repeat(2) { car1.loadPassenger() }
    repeat(3) { car2.loadPassenger() }

    truck.loadCargo(2.0)

    truck.move()
    car1.move()
    car2.move()

    truck.unloadPassenger()
    car1.unloadPassenger()
    car2.unloadPassenger()

    // После разгрузки
    truck.move()
    car1.move()
    car2.move()
}

