package lesson17_setters_and_getters

class QuizItem(
    val question: String,
    private var answer: String,
) {

    fun getAnswer(): String = answer

    fun setAnswer(newAnswer: String) {
        this.answer = newAnswer
    }
}

fun main() {
    val quizItem = QuizItem("Что такое Kotlin?", "Язык программирования")

    println("Вопрос: ${quizItem.question}")
    println("Ответ: ${quizItem.getAnswer()}")

    quizItem.setAnswer("Модернизированный язык для Android")
    println("Новый ответ: ${quizItem.getAnswer()}")
}