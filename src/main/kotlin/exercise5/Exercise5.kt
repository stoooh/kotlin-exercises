package exercise5

fun main() {
    val values = listOf(1, 5, 22, 56394, 478, 654, 43, 500, 499)
    //values.filterSmaller().forEach { println(it) }
    val filteredValues = values.filterSmaller(500)
    for (i in filteredValues) {
        println(i)
    }
}

fun List<Int>.filterSmaller(maxValue: Int): List<Int> { return this.filter { it < maxValue } }