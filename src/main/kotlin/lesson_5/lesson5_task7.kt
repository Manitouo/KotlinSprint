package org.example.lesson_5

fun main() {
    print("Расстояние поездки (км): ")
    val distance = readln().toDouble()
    print("Расход топлива на 100км (л): ")
    val fuelConsumption = readln().toDouble()
    print("Текущая цена за литр топлива (руб): ")
    val pricePerLitter = readln().toDouble()

    val fuelForTrip = (distance * fuelConsumption) / 100 //количество литров топлива для поездки
    val totalCost = fuelForTrip * pricePerLitter //стоимость поездки

    print(String.format("\nНеобходимо ${fuelForTrip}(л) топлива, итоговая стоимость поездки - %.2f(руб)", totalCost))
}