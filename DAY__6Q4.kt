class InvalidAgeException(message: String) : Exception(message)

fun checkAge(age: Int) {
    if (age < 18) {
        throw InvalidAgeException("Age must be 18 or older.")
    } else {
        println("Age $age is valid.")
    }
}

fun main() {
    try {
        checkAge(20) 
        checkAge(15) 
    } catch (e: InvalidAgeException) {
        println("Exception: ${e.message}")
    }
}
