import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextLine()!!.toInt()
    var list = nextLine()!!.split(" ").toMutableList()
    var result = 0
    with(list.sortedBy { it.toInt() }) {
        for ((index, value) in this.withIndex()) {
            list[index] = (value.toInt() + result).toString()
            result += value.toInt()
        }
        println(list.sumOf { it.toInt() })
    }
}
