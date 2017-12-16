package solve

fun main(args: Array<String>) {
//    val a: Int = null // compilation error
    val b: Int? = null

    val s1: String = "abc"
    val s2: String? = null
    s1.length
//    s2.length // compilation error
    s2?.length
}
