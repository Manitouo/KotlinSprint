package org.example.lesson_22

data class GalacticGuide(
    val name: String,
    val description: String,
    val date: Int,
    val time: Int?,
    val destination: Double,
)

fun toDestruct(info: String): GalacticGuide {
    val result = info.split(", ")
    return GalacticGuide(
        name = result[0], description = result[1], date = result[2].toInt(),
        time = result[3].toIntOrNull(), destination = result[4].toDouble()
    )
}

fun main() {
    val (name, description, date, time, destination) = toDestruct(
        "Alpha Centauri, Тройная звёздная система в южном созвездии Центавра, 1915, , 4.36"
    )

    println("$name\n$description\n$date\n$time\n$destination")
}