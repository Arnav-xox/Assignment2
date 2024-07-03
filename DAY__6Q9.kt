fun transformStrings(strings: List<String>, transformFunction: (String) -> String): List<String> {
    return strings.map { transformFunction(it) }
}

fun main() {
    val names = listOf("Alice", "Bob", "Charlie", "David")

    val uppercaseTransform: (String) -> String = { it.toUpperCase() }

    val transformedNames = transformStrings(names, uppercaseTransform)

    println("Original names: $names")
    println("Transformed names: $transformedNames")
}
