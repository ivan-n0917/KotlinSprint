package org.example.lesson17_setters_and_getters

class User {
    private var login: String? = null
    private var password: String? = null

    var loginProperty: String?
        get() = login
        set(value) {
            if (!value.isNullOrBlank()) {
                login = value
                println("Логин успешно изменён на: $value")
            } else {
                println("Новый логин не может быть пустым.")
            }
        }

    val passwordProperty: String
        get() = if (password.isNullOrBlank()) "" else "*".repeat(password!!.length)

    var passwordPropertySetter: String
        get() = passwordProperty
        set(value) {
            println("Вы не можете изменить пароль.")
        }
}

fun main() {
    val user = User()

    user.loginProperty = "ivan_ivanov"
    user.loginProperty = "ivan_new"

    println("Логин: ${user.loginProperty}")
    println("Пароль: ${user.passwordProperty}")
}