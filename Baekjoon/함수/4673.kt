import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val map = mutableMapOf<Int, Int>()

    for (number in 1 until 10000) {
        val result = d(number)
        if (map[result] == null) {
            map[result] = 1
        } else {
            map[result] = map[result]!! + 1
        }
    }

    for(number in 1 until 10000) {
        if (map[number] == null) {
            println(number)
        }
    }
}

fun d(number:Int): Int {
    val numberList: List<Int> = number.toString().map { it.digitToInt() }
    var result = number
    for (numberToken in numberList) {
        result += numberToken
    }
    return result
}
