package org.example.lesson_15

abstract class WeatherStationStats(
    val date: String,
    val value: Double,
    val name: String,
)

class Temperature(
    date: String,
    value: Double,
) : WeatherStationStats (date, value, name = "С")

class PrecipitationAmount(
    date: String,
    value: Double,
) : WeatherStationStats(date, value, name = "мм")

class WeatherServer() {
    fun sendMessage(objects: WeatherStationStats) {
        if (objects is Temperature) println("Температура от ${objects.date}: ${objects.value}${objects.name}")
        else if (objects is PrecipitationAmount) println("Осадки от ${objects.date}: ${objects.value}${objects.name}")
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

    val callServer = WeatherServer()
    callServer.sendMessage(temperature)
    callServer.sendMessage(precipitationAmount)
}