fun filterNonNull(numbers: List<Int?>): List<Int> {
    return numbers.filterNotNull()
}

fun main() {
    val nullableList = listOf(1, null, 3, null, 5)
    val nonNullList = filterNonNull(nullableList)
    println(nonNullList) 
}
