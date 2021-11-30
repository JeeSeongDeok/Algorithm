import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var token = nextLine()!!.split(" ")
    val n = token[0].toInt()
    val m = token[0].toInt()
    val board = mutableListOf<String>()
    repeat(n) {
        board.add(nextLine()!!)
    }
    for (startWidth in 0 until n - 7) {
        for (startHeight in 0 until m - 7) {
            
        }
    }
}
