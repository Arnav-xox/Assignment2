class BankAccount(val accountNumber: String, var balance: Double) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited $amount. New balance is $balance")
        } else {
            println("Invalid deposit amount")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrew $amount. New balance is $balance")
        } else {
            println("Invalid withdraw amount or insufficient balance")
        }
    }

    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    val account = BankAccount("123456", 100.0)
    println("Account Number: ${account.accountNumber}")
    println("Initial Balance: ${account.getBalance()}")

    account.deposit(50.0)
    account.withdraw(30.0)
    account.withdraw(150.0)
    println("Final Balance: ${account.getBalance()}")
}
