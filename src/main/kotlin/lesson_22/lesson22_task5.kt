package org.example.lesson_22

data class GalacticGuide(
    val name: String,
    val description: String,
    val date: Int,
    val time: Int?,
    val destination: Double,
) {
    override fun toString(): String {
        return "Имя: $name\nОписание: $description\nДата: $date\nВремя: ${time ?: "---"}" +
                "\nРасстоняие (св.год): $destination"
    }
}

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "",
        date = 1915,
        time = null,
        destination = 4.36,
    )

    println(alphaCentauri)
}