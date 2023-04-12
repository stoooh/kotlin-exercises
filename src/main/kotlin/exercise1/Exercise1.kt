package exercise1

fun main(args: Array<String>) {
    for (i in 0..100 step 5) {
        if (i <= 50) {
            //to do function 1
            printNumberBelow50(i)
        } else {
            //to do function 2
            printNumberAbove50(i)
        }
    }
}
fun printNumberBelow50(i: Int) {
    println("this function print number below 50: $i")
}

fun printNumberAbove50(i: Int) {
    println("this function print number above 50: $i")
}