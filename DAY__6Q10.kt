fun processStrings(strings: List<String>, startingLetter: Char): List<String> {
    return strings
        .filter { it.startsWith(startingLetter, ignoreCase = true) }
        .map { it.toUpperCase() } 
        .sorted() }

fun main() {
    val words = listOf("Apple", "banana", "Orange", "grape", "apricot", "Lemon")

    val processedWords = processStrings(words, 'a')

    println("Original words: $words")
    println("Processed words starting with 'a' and sorted: $processedWords")
}
