import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val (n, m) = nextLine()!!.split(" ").map { it.toInt() }
    val arr = IntArray(n)
    val line = nextLine().split(" ")
    for (arrIndex in 0 until n) {
        arr[arrIndex] = line[arrIndex].toInt()
    }
    arr.sort()
    var start = 0
    var end = arr[n - 1]
    while (start <= end) {
        var result: Long = 0
        val mid = (start + end) / 2
        for (tree in arr) {
            if (tree > mid) {
                result += (tree - mid).toLong()
            }
        }
        if (m > result) {
            end = mid - 1
        } else {
            start = mid + 1
        }
    }
    println(end)
}

