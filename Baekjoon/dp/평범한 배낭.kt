import java.util.*

var findValue = 0
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val token = nextLine()!!.split(" ")
    val n = token[0].toInt()
    val maxWeight = token[1].toInt()
    val list = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val line = nextLine()!!.split(" ")
        val weight = line[0].toInt()
        val value = line[1].toInt()
        list.add(Pair(weight, value))
    }
    maxValue(0, maxWeight, 0, list)
    println(findValue)
}

fun maxValue(index: Int, weight: Int, value: Int, list: MutableList<Pair<Int, Int>>) {
    if (index == list.size) {
        if (findValue < value)
            findValue = value
    } else if (weight - list[index].first < 0) {
        maxValue(index + 1, weight, value, list)
    } else {
        maxValue(index + 1, weight - list[index].first, value + list[index].second, list)
        maxValue(index + 1, weight, value, list)
    }
}
