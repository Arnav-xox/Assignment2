fun maxOfTwo(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main() {
    val num1 = 5
    val num2 = 10
    println("The larger number is: ${maxOfTwo(num1, num2)}")
}
