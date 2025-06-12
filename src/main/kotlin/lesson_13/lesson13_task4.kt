package org.example.lesson_13

class PhoneNumberTask4(
    var name: String,
    var number: Long?,
    var companyName: String? = null,
)

fun main() {

    var listOfContacts: MutableList<PhoneNumberTask4> = mutableListOf()

    print("Введите ваше имя: ")
    val name = readln()

    print("Введите номер телефона: ")
    val printedNumber = readln().toLongOrNull()

    val number: Long
    if (printedNumber == null) {
        println("Номер телефона не введен!")
        return
    } else number = printedNumber

    val companyName: String?
    print("Введите название компании: ")
    val printedCompanyName = readln()
    if (printedCompanyName.isNullOrEmpty()) companyName = null
    else companyName = printedCompanyName

    val number1 = PhoneNumberTask4(name, number, companyName)
    listOfContacts.add(number1)

    listOfContacts.forEach {
        println("$name\n$number\n$companyName")
    }
}