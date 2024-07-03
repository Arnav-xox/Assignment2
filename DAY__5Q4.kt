fun isSubset(list1: List<Int>, list2: List<Int>): Boolean {
    return list1.all { it in list2 }
}

fun main() {
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(1, 2, 3, 4, 5)
    val result = isSubset(list1, list2)
    println(result) 
}
