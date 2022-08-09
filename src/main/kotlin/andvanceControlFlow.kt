fun main() {
    val closedRange = 0..5
    val halfOpenRange = 0 until 5
    var sum = 0

    for (num in halfOpenRange){
        sum += num
        println(num)
    }
    println(sum)
}