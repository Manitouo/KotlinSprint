package org.example.lesson_13

class PhoneNumberTask3(
    val id: Int,
    var name: String,
    var number: Long,
    var companyName: String? = null,
    var list: MutableSet<PhoneNumberTask3>,
) {
    init {
        list.add(this)
    }

    fun printInformation() {
        list.forEach {
            if (companyName != null) println(companyName)
        }
    }
}

fun main() {
    val phoneNumber1 = PhoneNumberTask3(
        1,
        "Елена",
        79999999999,
        "null",
        list = mutableSetOf(),
    )
    val phoneNumber2 = PhoneNumberTask3(
        2,
        "Дмитрий",
        78888888888,
        list = mutableSetOf(),
    )
    val phoneNumber3 = PhoneNumberTask3(
        3,
        "Иван",
        77777777777,
        list = mutableSetOf(),
    )
    val phoneNumber4 = PhoneNumberTask3(
        4,
        "Ольга",
        76666666666,
        "Юг-Строй",
        list = mutableSetOf(),
    )
    val phoneNumber5 = PhoneNumberTask3(
        5,
        "Сергей",
        75555555555,
        "Весна",
        list = mutableSetOf(),
    )
    phoneNumber5.printInformation()
}