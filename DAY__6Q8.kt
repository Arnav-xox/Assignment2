fun adderFunction(numberToAdd: Int): (Int) -> Int {
    return { input: Int -> input + numberToAdd }
}

fun main() {
    val addFive = adderFunction(5)
    val result1 = addFive(10) 
    val result2 = addFive(20) 

    println("Result 1: $result1") 
    println("Result 2: $result2") 
}
