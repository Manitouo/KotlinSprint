package org.example.lesson_15

abstract class WeatherStationStats(
    val date: String,
    val value: Double,
    val name: String,
) {
    abstract fun printInformation()
}

class Temperature(
    date: String,
    value: Double,
) : WeatherStationStats (date, value, name = "С") {
    override fun printInformation() {
        println("Температура $date: $value$name")
    }
}

class PrecipitationAmount(
    date: String,
    value: Double,
) : WeatherStationStats(date, value, name = "мм") {
    override fun printInformation() {
        println("Количество осадков $date: $value$name")
    }
}

class WeatherServer() {
    fun sendMessage(objects: WeatherStationStats) {
        if (objects is Temperature) println("Данные о температуре")
        else if (objects is PrecipitationAmount) println("Данные об осадках")
        else println("Некорректные данные")
    }
}

fun main() {
    val temperature = Temperature(
        date = "19.05",
        value = 34.2,
    )

    val precipitationAmount = PrecipitationAmount(
        date = "24.03",
        value = 5.0,
    )

    val temperatureToServer = WeatherServer (temperature)
    val precipitationToServer = WeatherServer (precipitationAmount)
}