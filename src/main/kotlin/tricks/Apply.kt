package tricks

class StupidStringBuilder(var string: String) {
    fun append(new: String): StupidStringBuilder {
        string += new
        return this
    }

    override fun toString(): String = string
}

class StringBuilder(var string: String) {
    fun append(new: String) = this.apply { string += new }
    override fun toString(): String = string
}

fun main(args: Array<String>) {
    println(StupidStringBuilder("Kotlin").append(" is").append(" cool")) // Kotlin is cool
    println(StringBuilder("Kotlin").append(" is").append(" cool")) // Kotlin is cool
}
