fun main() {
    // while loop
    var x = 0
    var sum = 0
    while (sum <= 100) {
        sum += (sum + 1)
//        x++
        println(sum)
    }
    println("Done...")
    println(sum)

    var num = 0
    while (x <= 10){
        num += x
        println(num)
        x++
        if (x >= 5) {
            break
        }
    }
    println(num)

    sum = 1
    var lastSum = 0
    repeat(10) {
        val temp = sum
        sum += lastSum
        lastSum = temp
    }
    println(lastSum)
}