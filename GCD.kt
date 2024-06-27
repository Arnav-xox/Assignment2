fun gcd(a: Int, b: Int): Int {
    var num1 = a
    var num2 = b
    
    if (num1 < num2) {
        val temp = num1
        num1 = num2
        num2 = temp
    }
    
    while (num2 != 0) {
        val temp = num1 % num2
        num1 = num2
        num2 = temp
    }
    
    return num1
}

fun main() {
    val number1 = 24
    val number2 = 36
    
    val gcdResult = gcd(number1, number2)
    
    println("GCD of $number1 and $number2 is: $gcdResult")
}
