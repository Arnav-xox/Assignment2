fun isPalindrome(s: String): Boolean {
    val cleanedString = s.toLowerCase().replace(" ", "")
    val reversedString = cleanedString.reversed()
    return cleanedString == reversedString
}

fun main() {
    val testString = "A man a plan a canal Panama"
    println("Is the string \"$testString\" a palindrome? ${isPalindrome(testString)}")
}
