package org.example.lesson_20

fun main() {
    val splashScreen: (String) -> String = { username: String ->
        "С наступающим Новым Годом, $username!"
    }

    println(splashScreen("Евгений"))
}