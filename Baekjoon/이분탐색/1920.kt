import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextLine()!!.toInt()
    val list = nextLine()!!.split(" ").map { it.toInt() } as MutableList<Int>
    list.sort()
    val m = nextLine()!!.toInt()
    val findList = nextLine()!!.split(" ").map { it.toInt() } as MutableList<Int>

    findList.forEach { element ->
        println(search(list, element))
    }
}

fun search(list: MutableList<Int>, key: Int): Int {
    // 이분탐색에 필요한 변수들
    var start = 0
    var end = list.size - 1
    // 이분탐색 시작
    while (start <= end) {
        val center = (start + end) / 2
        if (list[center] == key) {
            return 1
        } else if (list[center] < key) {
            start = center + 1
        } else if (list[center] > key) {
            end = center - 1
        }
    }
    return 0
}
