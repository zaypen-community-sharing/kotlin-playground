package solve

class Pojo(var user: String?, var age: Int? = null)

fun main(args: Array<String>) {
    var a = Pojo("a")
    val b = Pojo("b", 18)
    a = Pojo("A") // it works
//    b = Pojo("A") // compilation error
}
