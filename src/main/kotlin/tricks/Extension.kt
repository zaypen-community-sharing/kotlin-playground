package tricks

fun oldGreet(who: String) = "$who: Hello"

fun String.greet() = "$this: Hello"

fun main(args: Array<String>) {
    println(oldGreet("Kotlin")) // Kotlin: Hello
    println("Kotlin".greet()) // Kotlin: Hello
}
