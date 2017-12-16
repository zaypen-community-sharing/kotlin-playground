package solve

class Complex(val real: Double, val imaginary: Double) {
    operator fun plus(c: Complex) =
            Complex(real + c.real, imaginary + c.imaginary)
}

fun main(args: Array<String>) {
    val a = Complex(1.0, 2.0)
    val b = Complex(3.0, 4.0)
    println(a + b)
}
