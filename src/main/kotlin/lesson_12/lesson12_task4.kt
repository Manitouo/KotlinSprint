package org.example.lesson_12

const val TO_CELSIUS = 273

class WeatherTask3(_daytimeTemperature: Int, _nightTemperature: Int, _isRainfall: Boolean) {

    var daytimeTemperature = _daytimeTemperature - TO_CELSIUS
    var nightTemperature = _nightTemperature - TO_CELSIUS
    var isRainfall = _isRainfall

    init {
        println(
            String.format(
                "Дневная температура: %.1f\nНочная температура: %.1f\nНаличие осадков: %s",
                daytimeTemperature,
                nightTemperature,
                isRainfall
            )
        )
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

}