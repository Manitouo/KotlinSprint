package org.example.lesson_19

import org.example.lesson_19.Gender.FEMALE
import org.example.lesson_19.Gender.MALE
import org.example.lesson_19.Gender.NOT_DEFINED

enum class Gender {
    MALE,
    FEMALE,
    NOT_DEFINED;
}

fun defineGender(genderFromString: String): Gender {
    if (genderFromString == "муж") return MALE
    else if (genderFromString == "жен") return FEMALE
    else return NOT_DEFINED
}

class Person(
    val name: String,
    val gender: Gender,
)

fun printCardInformation(personsList: MutableList<Person>) {
    personsList.forEach {
        println("${it.name}, ${it.gender}")
    }
}

fun main() {
    println(
        "Заполните данные 5 человек в формате [Имя:Пол] (следующего человека вносить с новой строки)" +
                "\nЖенщина - жен, мужчина - муж"
    )

    val personsList: MutableList<Person> = mutableListOf()

    while (personsList.size < 5) {
        val nextPerson = readln().split(":")
        personsList.add(Person(name = nextPerson[0], gender = defineGender(genderFromString = nextPerson[1])))
    }

    printCardInformation(personsList)
}