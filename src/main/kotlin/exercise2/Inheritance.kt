package exercise2

open class Inheritance {
    open fun printChild() {
        println("gabriele")
    }
}

class Student : Inheritance() {
    override fun printChild() {
        println("mirko")
    }
}

class Student2 : Inheritance() {
    override fun printChild() {
        println("roberto")
    }
}
