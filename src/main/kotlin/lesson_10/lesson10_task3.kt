package org.example.lesson_10

fun main() {
    println("Введите длину пароля: ")
    print(generatePassword(readln().toInt()))
}

fun generatePassword(length: Int) : String {
    var password = ""
    val numbersRange = 0..9
    val symbolsRange = "!\"#$%&'()*+,-./ "
    for (i in 1..length){
        if (i % 2 == 0) password += symbolsRange.random()
        else password += numbersRange.random()
    }
    return password
}