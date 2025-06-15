package org.example.lesson_13

class PhoneNumberTask5(
    var name: String,
    var number: Long?,
    var companyName: String? = null,
)

fun main() {
    print("Введите номер телефона: ")
    val printedNumber = readln()

    try {
        val number = printedNumber.toLong()
        val contact1 = PhoneNumberTask5 (
            name = "Алексей",
            number = number,
            companyName = "Юг-Продакт"
        )
        println("\n${contact1.name}\n${contact1.number}\n${contact1.companyName}")
    }
    catch (e: Exception) {
        println("Ошибка: неверный формат номера телефона!")
    }
}