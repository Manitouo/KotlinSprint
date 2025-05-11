package org.example.lesson_5

fun main() {
    print("""
        *Бортовой робот-андроид Марвин*
        Введите имя пользователя: 
    """.trimIndent())

    if (readln() == LOGIN) {
        print("Введите пароль: ")
        if (readln() == PASSWORD) print("Добро пожаловать, $LOGIN!")
        else print("Неверный пароль.")
    }
    else print("Пользователь не найден, пройдите регистрацию.")
}

const val LOGIN = "Zaphod"
const val PASSWORD = "PanGalactic"