package tricks

fun verboseDescribe(string: String) =
        "$string(${string.toLowerCase()}) has ${string.length} char(s)"

fun describe(string: String) = with (string) {
    "$this(${toLowerCase()}) has $length char(s)"
}

fun main(args: Array<String>) {
    println(verboseDescribe("Kotlin")) // Kotlin(kotlin) has 6 char(s)
    println(describe("Kotlin")) // Kotlin(kotlin) has 6 char(s)
}
