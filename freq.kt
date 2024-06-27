fun main() {
    val input = "hello world"
    val freq = mutableMapOf<Char, Int>()

    for (ch in input) {
        if (ch.isLetter()) {
            val lowerCh = ch.toLowerCase()
            val count = freq.getOrDefault(lowerCh, 0)
            freq[lowerCh] = count + 1
        }
    }

    for ((letter, count) in freq) {
        println("$letter: $count")
    }
}
