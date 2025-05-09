package org.example.lesson_4

fun main() {
    print("У корабля есть повреждения (true/false): ")
    val hasDamage = readln().toBoolean()
    print("Текущий состав экипажа (кол-во чел.): ")
    val crewCount = readln().toInt()
    print("Кол-во ящиков с провизией на борту (шт.): ")
    val provisionBoxCount = readln().toInt()
    print("Метеоусловия благоприятны (true/false): ")
    val isFavorableWeather = readln().toBoolean()

    val condition1 = (hasDamage == !HAS_DAMAGE) && (crewCount <= CREW_COUNT_MAX) && (crewCount >= CREW_COUNT_MIN) &&
            (provisionBoxCount > PROVISION_BOX_COUNT_MIN)
    val condition2 = (crewCount == CREW_COUNT_MAX) && (isFavorableWeather == IS_FAVORABLE_WEATHER) &&
            (provisionBoxCount >= PROVISION_BOX_COUNT_MIN)

    print("Корабль может приступить к долгосрочному плаванию: ")
    if (condition1 || condition2) print("true")
    else print("false")
}

const val HAS_DAMAGE = true
const val CREW_COUNT_MIN = 55
const val CREW_COUNT_MAX = 70
const val PROVISION_BOX_COUNT_MIN = 50
const val IS_FAVORABLE_WEATHER = true
