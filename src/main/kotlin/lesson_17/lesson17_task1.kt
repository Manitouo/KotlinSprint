package org.example.lesson_17

class Quiz(
    question: String,
    answer: String,
) {
    val question: String = question
        get() = field
    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val question1 = Quiz(
        question = "Мировое дерево в германо-скандинавской мифологии",
        answer = "Иггдрасиль"
    )

    println("Вопрос: ${question1.question}\nОтвет: ${question1.answer}")
}