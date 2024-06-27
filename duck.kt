fun isDuckNumber(number: Int): Boolean {
    var num = number
    var hasZero = false

    while (num > 0) {
        val digit = num % 10
        if (digit == 0) {
            hasZero = true
            break
        }
        num /= 10
    }

    return hasZero && number.toString()[0] != '0'
}

fun main() {
    val number = 1023
    if (isDuckNumber(number)) {
        println("$number is a Duck Number")
    } else {
        println("$number is not a Duck Number")
    }
}
