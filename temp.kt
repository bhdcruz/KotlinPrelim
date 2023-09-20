fun convertTemperature(value: Double, fromUnit: String, toUnit: String): Double {
    when {
        fromUnit.equals("celsius", ignoreCase = true) && toUnit.equals("fahrenheit", ignoreCase = true) ->
            return (value * 9/5) + 32

        fromUnit.equals("celsius", ignoreCase = true) && toUnit.equals("kelvin", ignoreCase = true) ->
            return value + 273.15

        fromUnit.equals("fahrenheit", ignoreCase = true) && toUnit.equals("celsius", ignoreCase = true) ->
            return (value - 32) * 5/9

        fromUnit.equals("fahrenheit", ignoreCase = true) && toUnit.equals("kelvin", ignoreCase = true) ->
            return (value - 32) * 5/9 + 273.15

        fromUnit.equals("kelvin", ignoreCase = true) && toUnit.equals("celsius", ignoreCase = true) ->
            return value - 273.15

        fromUnit.equals("kelvin", ignoreCase = true) && toUnit.equals("fahrenheit", ignoreCase = true) ->
            return (value - 273.15) * 9/5 + 32

        fromUnit.equals(toUnit, ignoreCase = true) ->
            return value

        else ->
            throw IllegalArgumentException("Invalid units")
    }
}

fun main() {
    val temperature = 100.0 // value of the temp
    val fromUnit = "celsius" // the type of temp that you want it to be converted from
    val toUnit = "fahrenheit" // the type of temp that you want it to be converted to
    
    val convertedTemperature = convertTemperature(temperature, fromUnit, toUnit)
    println("$temperature $fromUnit = $convertedTemperature $toUnit")
}