fun getStringLength(str: String?): Int {
    return str?.length ?: -1
}

fun main() {
    val nonNullString = "Hello"
    val nullString: String? = null
    
    println(getStringLength(nonNullString))
    println(getStringLength(nullString))
}
