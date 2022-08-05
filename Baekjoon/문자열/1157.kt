// 1157 문자열
import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val str = nextLine().uppercase()
    val map = mutableMapOf<Char, Int>()
    str.forEach {
        if (map[it] == null) {
            map[it] = 1
        } else {
            map[it] = map[it]!! + 1
        }
    }
    val reversedMap = mutableMapOf<Int, MutableList<Char>>()
    var maxIndex = 0
    map.forEach { (k, v) ->
        if (maxIndex < v) maxIndex = v

        if(reversedMap[v] == null) {
            reversedMap[v] = mutableListOf(k)
        } else {
            reversedMap[v]!!.add(k)
        }
    }
    if(reversedMap[maxIndex]!!.size != 1) {
        print("?")
    } else {
        print(reversedMap[maxIndex]!![0])
    }
}
