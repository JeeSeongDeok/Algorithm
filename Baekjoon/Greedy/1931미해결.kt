import java.util.*

data class Conference(val startTime: Int, val endTime: Int)
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextLine()!!.toInt()
    val list = mutableListOf<Conference>()
    repeat(n) {
        val (startTime, endTime) = nextLine()!!
            .split(" ")
            .map { it.toInt() }
        list.add(Conference(startTime, endTime))
    }
    list.sortBy { it.endTime }
    var iCount = 0
    var endTime = 0
    for (listIndex in 0 until list.size) {
        if (list[listIndex].startTime >= endTime) {
            iCount++
            endTime = if (list[listIndex].startTime == list[listIndex].endTime) list[listIndex].endTime + 1
            else list[listIndex].endTime
        }
    }
    println(iCount)
}
//fun main(args: Array<String>) = with(Scanner(System.`in`)) {
//    val n = nextLine()!!.toInt()
//    val list = mutableListOf<Pair<Int, Int>>()
//    repeat(n) {
//        val (startTime, endTime) = nextLine()!!
//            .split(" ")
//            .map { it.toInt() }
//        list.add(Pair(startTime, endTime))
//    }
//    list.sortBy { it.second }
//    var iCount = 0
//    var endTime = 0
//    for (listIndex in 0 until list.size) {
//        if (list[listIndex].first >= endTime) {
//            iCount++
//            endTime = list[listIndex].second
//        }
//    }
//    println(iCount)
//}

//
//import java.io.BufferedReader
//import java.io.InputStreamReader
//
//data class Conference(val start: Int, val end: Int): Comparable<Conference> {
//    override fun compareTo(other: Conference): Int {
//        return if (this.end == other.end)
//            this.start - other.end
//        else
//            this.end - other.end
//    }
//}
//
//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//
//    val n = readLine().toInt()
//    val seq: MutableList<Conference> = mutableListOf()
//
//    repeat(n) {
//        val (start: Int, end: Int) = readLine()
//            .split(" ")
//            .map { it.toInt() }
//
//        seq.add(Conference(start, end))
//    }
//
//    seq.sort()
//
//    var count = 1
//    var endTime = seq[0].end
//
//    for (i in 1 until n) {
//        if (seq[i].start >= endTime) {
//            endTime = seq[i].end
//            count++
//        }
//    }
//    println(count)
//}
//
