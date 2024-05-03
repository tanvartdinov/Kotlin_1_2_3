import kotlin.math.ceil

fun main() {
    val isRegularCustomer = true
    val purchaseAmount = 11901

    val discount = when (purchaseAmount) {
        in 0..1_000 -> 0
        in 1_001..10_000 -> 100
        else -> purchaseAmount * 5 / 100
    }

    val amountDue = (purchaseAmount - discount) * (if (isRegularCustomer) 0.99 else 1.0)
    println("Сумма к оплате - ${ceil(amountDue)}")
}