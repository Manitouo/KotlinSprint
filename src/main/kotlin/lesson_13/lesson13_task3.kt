package org.example.lesson_13

class PhoneNumberTask3(
    val id: Int,
    var name: String,
    var number: Long,
    var companyName: String? = null,
)

fun editList(list: List<PhoneNumberTask3>) {
    var listOfCompanies: MutableList<String?> = mutableListOf()

    list.forEach {
        listOfCompanies.add(it.companyName)
    }

    val editedListOfCompanies = listOfCompanies.mapNotNull { if (it == "null" || it == null) null else println(it) }
}

fun main() {
    val listOfNumbers = listOf(
        PhoneNumberTask3(id = 1, name = "Елена", number = 79999999999, companyName = "null"),
        PhoneNumberTask3(id = 2, name = "Петр", number = 78888888888),
        PhoneNumberTask3(id = 3, name = "Дмитрий", number = 77777777777, companyName = "Юг-Строй"),
        PhoneNumberTask3(id = 4, name = "Валерия", number = 76666666666),
        PhoneNumberTask3(id = 5, name = "Ксения", number = 75555555555, companyName = "Аматория")
    )
    editList(listOfNumbers)
}