fun removeLessThan(numbers: List<Int>, n: Int): List<Int> {
    return numbers.filter { it >= n }
}

fun main() {
    val originalList = listOf(1, 2, 3, 4, 5)
    val n = 3
    val filteredList = removeLessThan(originalList, n)
    println(filteredList)
}
