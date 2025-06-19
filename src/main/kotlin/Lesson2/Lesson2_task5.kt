package org.example.Lesson2

fun main() {

    val initialDeposit = 70_000.0
    val annualInterestRate = 16.7 / 100
    val years = 20

    val finalAmount = initialDeposit * Math.pow(1 + annualInterestRate, years.toDouble())

    println("Размер вклада через 20 лет: %.3f".format(finalAmount))
}