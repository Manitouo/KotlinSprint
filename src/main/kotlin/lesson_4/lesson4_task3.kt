package org.example.lesson_4

fun main() {
    val isSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val airHumidity: Int = 20
    val season: String = "Зима"

    print("Благоприятные ли условия сейчас для роста бобовых?")
    print ("${isSunny == IS_SUNNY && isAwningOpen == IS_AWNING_OPEN && 
            airHumidity == AIR_HUMIDITY && season != SEASON}")
}

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "Зима"