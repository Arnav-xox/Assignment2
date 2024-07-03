fun sortByAge(namesAndAges: List<Pair<String, Int>>): List<Pair<String, Int>> {
    return namesAndAges.sortedBy { it.second }
}

fun main() {
    val namesAndAges = listOf(
        Pair("Alice", 25),
        Pair("Bob", 30),
        Pair("Charlie", 20),
        Pair("David", 35)
    )

    val sortedList = sortByAge(namesAndAges)
    sortedList.forEach { println("${it.first}: ${it.second}") }
}
