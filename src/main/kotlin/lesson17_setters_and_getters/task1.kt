package lesson17_setters_and_getters

class QuizItem(
    val question: String,
    private var answer: String,
) {

    var answerProperty: String
        get() = answer
        set(value) {
            answer = value
        }
}

fun main() {
    val quizItem = QuizItem("Что такое Kotlin?", "Язык программирования")

    println("Вопрос: ${quizItem.question}")
    println("Ответ: ${quizItem.answerProperty}")

    quizItem.answerProperty = "Модернизированный язык для Android"
    println("Новый ответ: ${quizItem.answerProperty}")
}