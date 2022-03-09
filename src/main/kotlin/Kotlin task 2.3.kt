fun main() {
    val lastPurchase = 10_001_00
    val currentPurchase = 1000_00

    val standardDiscount = 100_00
    val highDiscount = 0.05
    val additionalDiscount = 0.01
    val meloman: Boolean = true

    var payment: Int

    if (lastPurchase >= 10_001_00) {
       payment = (currentPurchase - (currentPurchase * highDiscount)).toInt()
    } else if (lastPurchase in 1_001_00..10_000_00) {
            payment = (currentPurchase - standardDiscount)
        } else if (lastPurchase <= 1_001_00) {
                payment = currentPurchase
            } else {
                payment = 0
            }

    if (meloman) {
        payment = (payment - (payment * additionalDiscount)).toInt()
    }

    println("Сумма к оплате " + payment / 100 + "руб. " + payment % 100 + "коп.")
}

