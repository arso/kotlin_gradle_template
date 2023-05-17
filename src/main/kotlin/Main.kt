fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")
    Greeter("Kotlin main").greet()
}


class Greeter (private val name:String){
    fun greet() {
        println("$name says hello")
    }
}