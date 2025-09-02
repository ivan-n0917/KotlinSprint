package org.example.lesson17_setters_and_getters

class QuizElement(private val question: String, answer: String) {
    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }

    val currentQuestion: String
        get() = question
}