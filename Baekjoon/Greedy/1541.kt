import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val token = nextLine()!!.split("-")
    var result = 0
    for ((index, value) in token.withIndex()) {
        val list = value.split("+")
        if (index == 0)
            result += list.sumOf { it.toInt() }
        else
            result -= list.sumOf { it.toInt() }
    }
    println(result)
}
