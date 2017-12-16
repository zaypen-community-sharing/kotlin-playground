package tricks

const val MIN_WIDTH = 0
const val MIN_HEIGHT = 0
const val MAX_WIDTH = 1920
const val MAX_HEIGHT = 1080

fun badValidate(x: Int, y: Int): Boolean {
    return (x >= MIN_WIDTH
            && x <= MAX_WIDTH
            && y >= MIN_HEIGHT
            && y <= MAX_HEIGHT)
}

fun goodValidate(x: Int, y: Int): Boolean =
        (x in MIN_WIDTH..MAX_WIDTH && y in MIN_HEIGHT..MAX_HEIGHT)

fun validate(x: Int, y: Int): Boolean =
        listOf(x in MIN_WIDTH..MAX_WIDTH, y in MIN_HEIGHT..MAX_HEIGHT).all { it }

fun main(args: Array<String>) {
    println(badValidate(-1, 256))
    println(goodValidate(-1, 256))
    println(validate(-1, 256))
}
