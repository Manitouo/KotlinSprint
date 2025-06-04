package org.example.lesson_13

class PhoneNumberTask2(
    val id: Int,
    var name: String,
    var number: Long,
    var companyName: String? = null,
) {
    init {
        println("-Имя: $name\n-Номер: $number\n-Компания: ${companyName ?: "<не указано>"}")
    }
}

fun main() {
    val phoneNumber1 = PhoneNumberTask2(
        1,
        "Елена",
        799999999,
    )
}