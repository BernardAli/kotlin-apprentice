import kotlin.math.PI
import kotlin.math.sin
import kotlin.math.sqrt

fun main() {
    // comments
    /**
    println("Hello World!")
    */

    println("Kotlin Apprentice")
    println(32 * 12)
    println(32 / 5)
    println(32 % 5.0)
    println(32 / 5.0)
    println(32 + 12)
    println(32 - 12.0)
    println(22 / 7.0)

    // format
    println("%.0f".format(28.0 % 10.0))

    // shr and shl
    println(1 shl 3)
    println(16 shr 2)

    // math functions
    val a = sin(45 * PI / 180)
    println(a)

    println(sqrt(144.0))

    var number: Int = 10
    number = 40
    println(number)

    var name:String = "Ben"
    name = "Opoku"
    println(name)

    // variables
    var age = 30
    age += 1
    --age
    println(age)
    ++age
    age++
    println(age)
}