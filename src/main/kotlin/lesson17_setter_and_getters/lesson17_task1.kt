package lesson17_setter_and_getters

class QuizElement(question: String, answer: String) {

    val question: String = question
        get() = field

    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}