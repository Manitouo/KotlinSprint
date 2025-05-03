package org.example.lesson_4

fun main() {
    val averageWeightFirst = 20
    val averageVolumeFirst = 80

    val averageWeightSecond = 50
    val averageVolumeSecond = 100

    println("Груз с весом ${averageWeightFirst}кг и объемом ${averageVolumeFirst}л соответствует категории 'Average': ${averageWeightFirst > AVERAGE_WEIGHT_MIN && averageWeightFirst <= AVERAGE_WEIGHT_MAX && averageVolumeFirst < AVERAGE_VOLUME}")
    println("Груз с весом ${averageWeightSecond}кг и объемом ${averageVolumeSecond}л соответствует категории 'Average': ${averageWeightSecond > AVERAGE_WEIGHT_MIN && averageWeightSecond <= AVERAGE_WEIGHT_MAX && averageVolumeSecond < AVERAGE_VOLUME}")

}

const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_VOLUME = 100