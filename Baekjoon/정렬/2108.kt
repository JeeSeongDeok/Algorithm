import java.util.*
import kotlin.math.roundToInt

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextLine().toInt()
    var list = mutableListOf<Int>()
    var map = mutableMapOf<Int, Int>()
    for(index in 0 until n) {
        list.add(nextLine().toInt())
        map[list[index]] = map.getOrDefault(list[index], 0) + 1
    }
    list = list.sorted() as MutableList<Int>
    // 평균
    println(list.average().roundToInt())
    // 센터값
    println(list[n / 2])
    // 최빈값
    var check = false
    var count = -1
    var index = -1
    for(i in map.keys.sorted()){
        if(map[i]!!>count){
            count = map[i]!!
            index = i
            check = false
        }
        else if(map[i] ==count && !check){
            index = i
            check =true
        }
    }
    println(index)
    // 범위
    if (list.size == 1) {
        println(0)
    } else {
        println(list.last() - list[0])
    }
}
