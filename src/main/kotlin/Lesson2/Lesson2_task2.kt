package org.example.Lesson2

fun main() {

    val permanentEmployees = 50
    val permanentSalary = 30_000
    val interns = 30
    val internSalary = 20_000

    val permanentExpenses = permanentEmployees * permanentSalary

    val totalExpenses = permanentExpenses + (interns * internSalary)

    val averageSalary = totalExpenses / (permanentEmployees + interns)

    println("Расходы на постоянных сотрудников: $permanentExpenses руб.")
    println("Общие расходы по ЗП: $totalExpenses руб.")
    println("Средняя ЗП одного сотрудника: $averageSalary руб.")
}