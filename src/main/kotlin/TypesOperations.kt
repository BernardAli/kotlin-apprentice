fun main() {
    // Int // Float // Double
    var integer: Int = 100
    var decimal: Double = 12.5
    integer = decimal.toInt()
    println(integer)

    var hourlyRate = 10.5F
    val hoursWorked = 45
    var weeklyWages = hourlyRate * hoursWorked
    println(weeklyWages)

    //Strings
    val name = "Bernard Ali"
    println(name.uppercase())
    println(name.length)
    println("My name is $name")
    println("1/3 = ${1/3.0}")

    var bigString = """
        Very big strings
        Lets see how they work together
    """.trimIndent()
    println(bigString)
}