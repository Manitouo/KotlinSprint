package org.example.lesson_12

class WeatherTask3(_daytimeTemperature: Int, _nightTemperature: Int, _isRainfall: Boolean) {

    val daytimeTemperature = _daytimeTemperature - TO_CELSIUS1
    val nightTemperature = _nightTemperature - TO_CELSIUS1
    val isRainfall = _isRainfall

    fun printInformation() {
        println("Дневная температура: $daytimeTemperature\nНочная температура: $nightTemperature" +
                "\nНаличие осадков: $isRainfall")
    }
}

fun main() {
    val day1 = WeatherTask3(
        _daytimeTemperature = 296,
        _nightTemperature = 287,
        _isRainfall = false,
    )

    val day2 = WeatherTask3(
        _nightTemperature = 261,
        _daytimeTemperature = 275,
        _isRainfall = true,
    )


    day1.printInformation()
    day2.printInformation()
}

const val TO_CELSIUS1 = 273