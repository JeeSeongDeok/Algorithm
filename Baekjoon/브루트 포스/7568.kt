import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextLine().toInt()
    val group = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val info = nextLine()!!.split(" ")
        val weight = info[0].toInt()
        val height = info[1].toInt()
        group.add(Pair(weight, height))
    }
    for (loop in group.indices) {
        var rank = 1
        val loopWeight = group[loop].first
        val loopHeight = group[loop].second
        for (gIndex in 0 until group.size) {
            val benchWeight = group[gIndex].first
            val benchHeight = group[gIndex].second
            if (loopWeight < benchWeight && loopHeight < benchHeight) rank += 1
        }
        print("$rank ")
    }
}
