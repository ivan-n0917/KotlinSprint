package lesson17_setters_and_getters

class QuizItem(
    question: String,
    answer: String
) {

    var question: String = question
        get() = field

    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val quizItem = QuizItem("Что такое Kotlin?", "Язык программирования")

    println("Вопрос: ${quizItem.question}")
    println("Ответ: ${quizItem.answer}")

    quizItem.answer = "Модернизированный язык для Android"
    println("Новый ответ: ${quizItem.answer}")
}