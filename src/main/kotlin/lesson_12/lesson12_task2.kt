package org.example.lesson_12

class WeatherTask2(
    var daytimeTemperature: Int,
    var nightTemperature: Int,
    var isRainfall: Boolean,
) {

    fun printInformation() {
        println(
            "Дневная температура: ${daytimeTemperature}\nНочная температура: ${nightTemperature}" +
                    "\nНаличие осадков: ${isRainfall}"
        )
    }
}

fun main() {
    val day1 = WeatherTask2(
        daytimeTemperature = 22,
        nightTemperature = 14,
        isRainfall = false,
    )

    val day2 = WeatherTask2(
        nightTemperature = -12,
        daytimeTemperature = -2,
        isRainfall = true,
    )


    day1.printInformation()
    day2.printInformation()
}