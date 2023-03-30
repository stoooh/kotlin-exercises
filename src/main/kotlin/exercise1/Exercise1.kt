package exercise1

fun main(args: Array<String>) {
    for (i in 1..100 step 2) {
        if (i <= 50) {
            //to do function 1
            printNumberBelow50(i)
        } else {
            //to do function 2
            printNumberAbove50(i)
        }
    }
}

fun printNumberBelow50(number: Int) {
    println("this function print number below 50: $number")
}

fun printNumberAbove50(number: Int) {
    println("this function print number above 50: $number")
}