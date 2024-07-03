data class User(val name: String?, val email: String?)

fun printUserDetails(user: User) {
    if (user.name == null || user.email == null) {
        println("Incomplete User")
    } else {
        println("User Details:")
        println("Name: ${user.name}")
        println("Email: ${user.email}")
    }
}

fun main() {
    val user1 = User("John Doe", "john.doe@example.com")
    val user2 = User(null, "jane.doe@example.com")
    val user3 = User("Alice", null)
    
    printUserDetails(user1) // This will print user details
    printUserDetails(user2) // This will print "Incomplete User"
    printUserDetails(user3) // This will print "Incomplete User"
}
