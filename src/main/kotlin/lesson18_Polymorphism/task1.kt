package lesson18_Polymorphism

class Orders(
    val orderId: String,
) {
    fun printOrderInfo(product: String) {
        println("Заказан товар : $product")
    }

    fun printOrderInfo(product: List<String>) {
        val productList = product.joinToString(", ")
        println("Заказаны следующие товары : $productList")
    }
}

fun main() {

    val order1 = Orders("123456")
    val order2 = Orders("789101")

    order1.printOrderInfo("[Майка]")
    order2.printOrderInfo(listOf("[Майка]", "[Футболка]", "[Куртка]"))
}