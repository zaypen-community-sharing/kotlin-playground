package solve

fun main(args: Array<String>) {
    val list = listOf(null, 0, 1, 2) // List<Int?>
    val results = list
            .filter { it != null }
            .map { it!! * 2 }
}
