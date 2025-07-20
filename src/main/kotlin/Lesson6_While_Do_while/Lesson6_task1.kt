package org.example.Lesson6_While_Do_while

fun main() {

        println("Регистрация нового пользователя")
        print("Создайте логин: ")
        val username = readln()
        print("Создайте пароль: ")
        val password = readln()

        while (true) {
            println("Авторизация")
            print("Логин: ")
            val inputUser = readln()
            print("Пароль: ")
            val inputPass = readln()

            if (inputUser == username && inputPass == password) {
                println("Авторизация прошла успешно!")
                break
            } else {
                println("Неверный логин или пароль. Попробуйте снова.")
            }
        }
    }

