import java.util.*

data class ZeroOrOne(val zero: Int, val one: Int)

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val testCase = nextLine()!!.toInt()
    repeat(testCase) {
        val fibonacciList = mutableListOf<ZeroOrOne>(ZeroOrOne(1, 0), ZeroOrOne(0, 1))
        val n = nextLine()!!.toInt()
        // n번 반복
        for (index in 1 until n) {
            val zero = fibonacciList[index].zero + fibonacciList[index - 1].zero
            val one = fibonacciList[index].one + fibonacciList[index - 1].one
            fibonacciList.add(ZeroOrOne(zero, one))
        }
        println("${fibonacciList[n].zero} ${fibonacciList[n].one}")
    }
}
