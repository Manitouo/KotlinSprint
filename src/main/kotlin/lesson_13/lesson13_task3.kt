package org.example.lesson_13

class PhoneNumberTask3(
    val id: Int,
    var name: String,
    var number: Long,
    var companyName: String? = null,
    var list: MutableList<PhoneNumberTask3>,
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
        list = mutableListOf(),
    )
    val phoneNumber2 = PhoneNumberTask3(
        2,
        "Дмитрий",
        78888888888,
        list = mutableListOf(),
    )
    val phoneNumber3 = PhoneNumberTask3(
        3,
        "Иван",
        77777777777,
        list = mutableListOf(),
    )
    val phoneNumber4 = PhoneNumberTask3(
        4,
        "Ольга",
        76666666666,
        "Юг-Строй",
        list = mutableListOf(),
    )
    val phoneNumber5 = PhoneNumberTask3(
        5,
        "Сергей",
        75555555555,
        "Весна",
        list = mutableListOf(),
    )
    phoneNumber5.printInformation()
}