package org.example.lesson_12

import kotlin.random.Random

const val TO_CELSIUS = 273

class WeatherTask5(_daytimeTemperature: Int, _nightTemperature: Int, _isRainfall: Boolean) {

    val daytimeTemperature = _daytimeTemperature - TO_CELSIUS
    val nightTemperature = _nightTemperature - TO_CELSIUS
    val isRainfall = _isRainfall

    init {
        println(
            "Дневная температура: $daytimeTemperature\nНочная температура: $nightTemperature" +
                    "\nНаличие осадков: $isRainfall\n"
        )
    }
}

fun main() {
    val weatherList = List(30) {
        WeatherTask5(
            _daytimeTemperature = Random.nextInt(243, 303),
            _nightTemperature = Random.nextInt(243, 303),
            _isRainfall = Random.nextBoolean(),
        )
    }

    val rainfallDayCount = weatherList.filter { it.isRainfall }.size

    val nightWeatherList = weatherList.map { it.nightTemperature }

    val daytimeWeatherList = weatherList.map { it.daytimeTemperature }

    val stringToPrint = """
    Средняя ночная температура: ${"%.2f".format(nightWeatherList.average())}
    Средняя дневная температура: ${"%.2f".format(daytimeWeatherList.average())}
    Количество дней с осадками: $rainfallDayCount
    """.trimIndent()

    println(stringToPrint)
}
