fun getStringLengths(strings: List<String>): Map<String, Int> {
    return strings.associateWith { it.length }
}

fun main() {
    val originalList = listOf("apple", "banana", "cherry")
    val lengthMap = getStringLengths(originalList)
    println(lengthMap)
}
