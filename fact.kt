fun factorial(n: Int): Int {
    return if (n <= 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}

fun main() {
    val number = 9
    
    println("The factorial of $number is: ${factorial(number)}")
}