package lesson1

fun main() {
    var applePrice: Double = 25.5
    var applesAmount: Int = 15

    var totalPrice = applePrice * applesAmount

    totalPrice += totalPrice * 0.05

    println("Итоговая стоимость: $totalPrice")
}