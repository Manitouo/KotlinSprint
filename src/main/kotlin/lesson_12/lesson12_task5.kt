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
    var i = 30
    var weatherMutableList: MutableList<WeatherTask5> = mutableListOf()
    var nightWeatherList: MutableList<Int> = mutableListOf()
    var daytimeWeatherList: MutableList<Int> = mutableListOf()
    var rainfallDayCount = 0

    while (i > 0) {
        weatherMutableList.add(
            WeatherTask5(
                _daytimeTemperature = Random.nextInt(243, 303),
                _nightTemperature = Random.nextInt(243, 303),
                _isRainfall = Random.nextBoolean(),
            )
        )
        i--
    }

    weatherMutableList.map {
        if (it.isRainfall) rainfallDayCount++
        nightWeatherList.add(it.nightTemperature)
        daytimeWeatherList.add(it.daytimeTemperature)
    }

    val stringToPrint = """
    Средняя ночная температура: ${"%.2f".format(nightWeatherList.average())}
    Средняя дневная температура: ${"%.2f".format(daytimeWeatherList.average())}
    Количество дней с осадками: $rainfallDayCount
    """.trimIndent()

    println(stringToPrint)
}
