package exercise2

interface Interface {
    fun printNameChild() = Unit
}

class PrintNameChildren : Interface {
    override fun printNameChild() {
        println("alessio")
    }
}

class PrintNameChildren1 : Interface {
    override fun printNameChild() {
        println("alberto")
    }
}
