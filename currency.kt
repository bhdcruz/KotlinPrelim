fun convertCurrency(amount: Double, exchangeRate: Double): Double {
    return amount * exchangeRate
}

fun main() {
    val amountInPHP = 100.0 
    val exchangeRatePHPToUSD = 0.0176519 
    
    if (amountInPHP >= 0.0 && exchangeRatePHPToUSD > 0.0) {
        val amountInUSD = convertCurrency(amountInPHP, exchangeRatePHPToUSD)
        println("PHP$amountInPHP = USD $amountInUSD")
    } else {
        println("Error: Amount and exchange rate must be positive values")
    }
}