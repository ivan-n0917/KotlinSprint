package org.example.lesson16_encapsulation

class Player(
    val name: String,
    private var health: Int,
    private var attackPower: Int,
) {

    private var isAlive = true

    fun takeDamage(damage: Int) {
        if (!isAlive) {
            println("$name уже мёртв.")
            return
        }

        println("$name получил $damage урона.")
        health -= damage

        if (health <= 0) {
            die()
        } else {
            println("Оставшееся здоровье: $health")
        }
    }

    fun heal(amount: Int) {
        if (!isAlive) {
            println("$name мёртв и больше не может лечиться.")
            return
        }

        println("$name был исцелён на $amount единиц.")
        health += amount
        println("Текущее здоровье: $health")
    }

    private fun die() {
        health = 0
        attackPower = 0
        isAlive = false
        println("$name погиб. Здоровье и сила атаки обнулены.")
    }

    fun printStatus() {
        println("Игрок: $name | Здоровье: $health | Сила атаки: $attackPower | Жив: $isAlive")
    }
}

fun main() {
    val player = Player("Вася", 100, 20)

    player.printStatus()

    player.takeDamage(30)
    player.heal(20)
    player.takeDamage(40)
    player.takeDamage(30)
    player.takeDamage(30)
}