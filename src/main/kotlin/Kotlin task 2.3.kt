fun main() {
    val lastPurchase = 10_001_00
    val currentPurchase = 100_00

    val standardDiscount = 100_00
    val highDiscount = 0.05
    val additionalDiscount = 0.01
    val meloman: Boolean = true

    var payment: Int = if (lastPurchase >= 10_001_00) {
        (currentPurchase * (1 - highDiscount)).toInt()
    } else if (lastPurchase in 1_001_00..10_000_00) {
        (currentPurchase - standardDiscount)
    } else {
        currentPurchase
    }

    if (meloman) {
        payment = (payment * (1 - additionalDiscount)).toInt()
    }

    println("Сумма к оплате ${payment / 100}руб. ${payment % 100}коп.")
}

