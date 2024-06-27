fun isArmstrongNumber(number: Int): Boolean {
    val numberString = number.toString()
    val numberOfDigits = numberString.length
    var sumOfPowers = 0

    for (char in numberString) {
        val digit = char.toString().toInt()
        var power = 1
        for (i in 1..numberOfDigits) {
            power *= digit
        }
        sumOfPowers += power
    }

    return number == sumOfPowers
}

fun main() {
    val number = 459
    if (isArmstrongNumber(number)) {
        println("$number is an Armstrong number")
    } else {
        println("$number is not an Armstrong number")
    }
}