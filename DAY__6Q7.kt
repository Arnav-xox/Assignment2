fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val sumOfOddSquaredNumbers = numbers
        .map { it * it }                
        .filter { it % 2 != 0 }         
        .reduceOrNull { acc, num -> acc + num } ?: 0 // Sum the remaining numbers

    println("Original numbers: $numbers")
    println("Squared numbers: ${numbers.map { it * it }}")
    println("Filtered odd squared numbers: ${numbers.map { it * it }.filter { it % 2 != 0 }}")
    println("Sum of odd squared numbers: $sumOfOddSquaredNumbers")
}
