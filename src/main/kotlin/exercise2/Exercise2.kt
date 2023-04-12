package exercise2

//    Write two different implementations of 1 parent and 2 children classes that
//    override one method - one using inheritance and another using interfaces.
fun main() {
//interfaces
    val print1 = PrintNameChildren()
    val print2 = PrintNameChildren1()

    print1.printNameChild()
    print2.printNameChild()

    //inheritance

    val firstGuy = Student()
    val secondGuy = Student2()

    firstGuy.printChild()
    secondGuy.printChild()
}
