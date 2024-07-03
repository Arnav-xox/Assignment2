import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch {
        try {
            delay(1000)
            println("Task 1 completed")
            
            delay(2000)
            println("Task 2 completed")
            
            throw RuntimeException("Simulated exception in Task 3")
            
            delay(1500)
            println("Task 3 completed")
            
        } catch (e: Exception) {
            println("Exception occurred: ${e.message}")
        }
    }
    
    runBlocking {
        delay(5000)
    }
}
