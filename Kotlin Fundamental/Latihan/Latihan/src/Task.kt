fun main() {
    val valueA = 65
    val valueB = 52
    val valueC = 78

    val result = calculate(valueA, valueB, valueC)
    val resultb = calculate(valueA,valueB,valueC)
    // TODO 3
    println(result)
    println("resultB is 17")
}

fun calculate(valueA: Int, valueB: Int, valueC: Int?): String {
    // TODO 1
    val result = (valueA + (valueB - (valueC?: 100)))
    return generateResult(result)
}

// TODO 2
fun generateResult(result: Int) = "resultA is $result"