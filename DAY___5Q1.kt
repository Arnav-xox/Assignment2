fun reverseList(numbers: List<Int>): List<Int> {
    return numbers.reversed()
}

fun main() {
    val originalList = listOf(1, 2, 3, 4, 5)
    val reversedList = reverseList(originalList)
    println(reversedList)
}
