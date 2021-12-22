import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val (n, m) = nextLine().split(" ")
    val list = nextLine().split(" ")
    var result = 0
    for (first in list.indices) {
        for (second in first + 1 until list.size) {
            for (third in second + 1 until list.size) {
                val sum = list[first].toInt() + list[second].toInt() + list[third].toInt()
                if (result < sum && m.toInt() >= sum) {
                    result = sum
                }
                if (result == m.toInt()) {
                    break
                }
            }
        }
    }
    print(result)
}
