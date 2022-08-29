import java.util.*

private val sb = StringBuilder()
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextLine().toInt()
    val list = nextLine().split(" ").map { it.toInt() }
    val sortList = list.distinct().sorted()

    for (i in 0 until n) {
        sb.append(sortList.binarySearch(list[i])).append(" ")
    }
    print(sb.toString())
}
