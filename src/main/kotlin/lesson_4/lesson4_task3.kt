package org.example.lesson_4

fun main() {
    val weatherTodayIsSunny: Boolean = true
    val tentIsOpen: Boolean = true
    val airHumidity: Int = 20
    val season: String = "Зима"

    print("Благоприятные ли условия сейчас для роста бобовых?")
    print ("${weatherTodayIsSunny == WEATHER_IS_SUNNY && tentIsOpen == TENT_IS_OPEN && airHumidity == AIR_HUMIDITY && season == SEASON}")
}

const val WEATHER_IS_SUNNY = true
const val TENT_IS_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "Не зима"