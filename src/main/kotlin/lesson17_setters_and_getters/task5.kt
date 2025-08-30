package org.example.lesson17_setters_and_getters

class User {
    private var login: String? = null
    private var password: String? = null

    fun getLogin(): String? = login

    fun getPassword(): String {
        return if (password.isNullOrBlank()) "" else "*".repeat(password!!.length)
    }

    fun setLogin(newLogin: String) {
        if (newLogin.isNotBlank()) {
            login = newLogin
            println("Логин успешно изменён на: $newLogin")
        } else {
            println("Новый логин не может быть пустым.")
        }
    }

    fun setPassword() {
        println("Вы не можете изменить пароль.")
    }
}

fun main() {
    val user = User()

    user.setLogin("ivan_ivanov")
    user.setLogin("ivan_new")

    user.setPassword()

    println("Логин: ${user.getLogin()}")
    println("Пароль: ${user.getPassword()}")
}