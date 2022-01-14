import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextLine()!!.toInt()
    var queue: Queue<Int> = LinkedList()
    // 큐에 요소 넣기
    for (number in 1..n) {
        queue.add(number)
    }
    while (queue.size != 1) {
        queue.remove()
        var first = queue.poll()
        queue.add(first)
    }
    println(queue.peek())
}
