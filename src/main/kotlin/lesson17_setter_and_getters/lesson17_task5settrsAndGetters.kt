package org.example.lesson17_setter_and_getters

class User(
    login: String,
    password: String,
) {

    var login: String = login
        set(value) {
            field = value
            println("Логин успешно изменен")
        }

    var password: String = password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
            field = value
        }
}

fun main() {

    print("Введите логин: ")
    val login = readln()

    print("Введите пароль: ")
    val password = readln()

    val user = User(login, password)

    println("   Логин: ${user.login}")
    println("   Пароль: ${user.password}")

    print("   Введите новый логин: ")
    val newLogin = readln()
    user.login = newLogin

    println("   Логин: ${user.login}")

}