package org.example.lesson_12


class Weather() {
    var daytimeTemperature: Int = 0
    var nightTemperature: Int = 0
    var isRainfall: Boolean = false

    fun printInformation(){
        println("Дневная температура: ${daytimeTemperature}\nНочная температура: ${nightTemperature}" +
                "\nНаличие осадков: ${isRainfall}")
    }
}

fun main() {
    val day1 = Weather()
    day1.nightTemperature = 14
    day1.daytimeTemperature = 22
    val day2 = Weather()
    day2.nightTemperature = -12
    day2.daytimeTemperature = -2
    day2.isRainfall = true

    day1.printInformation()
    day2.printInformation()
}