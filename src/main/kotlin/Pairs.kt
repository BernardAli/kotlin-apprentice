fun main() {
    var coordinates = Pair(12, 10)
    println(coordinates.first)
    println(coordinates.second)

    var details = Pair("Ben", 30)
    val (x, y) = details
    println(x)
    println(y*2.7334)

    var otherPair = 2 to 3
    val(a, b) = otherPair
    println(a)
    println(b)
}