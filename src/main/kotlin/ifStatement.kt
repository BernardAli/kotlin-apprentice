fun main() {
    var a = 10
    var b = 20

    val max  = if (a > b) a else b
    val min  = if (a < b) a else b

    println(max)
    println(min)

    var name = "Ben"

    // Short Circuiting
    if (10 > 2 || name == "Matt Galloway") {
        println(true)
    } else {
        println(false)
    }
}