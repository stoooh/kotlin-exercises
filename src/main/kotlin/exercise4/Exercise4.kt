package exercise4

fun main() {
    val numbers = listOf (1, 2, 3, 4, 5)
    val stringNumbers = numbers.map {it.toString()}

    for (it in stringNumbers){
        println(it)
    }
}