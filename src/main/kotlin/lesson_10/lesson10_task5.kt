package org.example.lesson_10

fun main() {
    println("Введите логин: ")
    val login = readln()
    println("Введите пароль: ")
    val password = readln()
    if (authorizeUser(login, password) != null) {
        println(returnListOfProducts(generateToken()))
    }
    else println("Неверный логин или пароль")
}

const val LOGIN = "login"
const val PASSWORD = "password"

fun authorizeUser(login: String, password: String): String? {
    if (login == LOGIN && password == PASSWORD) return "LogIn"
    else return null
}

fun generateToken(): String {
    val numbersRange = 0..9
    val charSmallRange = 'a'..'z'
    val charCapitalRange = 'A'..'Z'
    val token = mutableListOf("")


    token.add(numbersRange.random().toString())
    token.add(charCapitalRange.random().toString())

    for (i in 3..32 step 3){
        token.add(numbersRange.random().toString())
        token.add(charCapitalRange.random().toString())
        token.add(charSmallRange.random().toString())
    }

    token.shuffle()
    return token.joinToString().replace(", ", "")
}

fun returnListOfProducts(token: String?): Any {
    val listOfProducts = listOf("свитер", "кроссовки", "юбка")
    return listOfProducts
}