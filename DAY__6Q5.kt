fun accessArrayElement(array: Array<Int>, index: Int) {
    try {
        val element = array[index]
        println("Element at index $index: $element")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Error: Index $index is out of bounds.")
    } finally {
        println("End of array access operation.")
    }
}

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)

    accessArrayElement(array, 2)   // Index 2 exists
    accessArrayElement(array, 10)  // Index 10 does not exist
}
