fun printUppercase(str: String?) {
    str?.let {
        println(it.toUpperCase())
    } ?: println("String is null")
}

fun main() {
    val nonNullString = "hello"
    val nullString: String? = null
    
    printUppercase(nonNullString) // This will print: HELLO
    printUppercase(nullString)   // This will print: String is null
}
