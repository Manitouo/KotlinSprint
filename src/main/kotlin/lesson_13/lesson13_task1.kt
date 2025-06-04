package org.example.lesson_13

class PhoneNumber(
    val id: Int,
    var name: String,
    var number: Long,
    var companyName: String?,
)

fun main() {
    val phoneNumber1 = PhoneNumber(
        1,
        "Елена",
        799999999,
        null,
    )
    val phoneNumber2 = PhoneNumber(
        2,
        "Дмитрий",
        78888888888,
        "СтудиоБокс",
    )
}