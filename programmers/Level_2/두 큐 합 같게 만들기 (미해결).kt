class Solution {
    var answer: Int = Int.MAX_VALUE
    fun solution(queue1: IntArray, queue2: IntArray): Int {
        val q1 = queue1.toMutableList()
        val q2 = queue2.toMutableList()
        doThis(q1, q2, 0)
        return if (answer == Int.MAX_VALUE) -1
        else answer - 1
    }

    private fun doThis(queue1: MutableList<Int>, queue2: MutableList<Int>, count: Int) {
        if (queue1.isEmpty() || queue2.isEmpty() || count >= answer) {
            return
        }
        if (sumList(queue1) + sumList(queue2) == 15L) {
            if (answer > count)
                answer = count
            return
        }
        val q1Int = queue1[0]
        val q2Int = queue2[0]
        queue2.removeFirst()
        // Q2 pop
        doThis(queue1, queue2, count + 1)
        // Q2 POP 후 Insert
        queue1.add(q2Int)
        doThis(queue1, queue2, count + 1)
        queue1.removeLastOrNull()
        // Q1 POP만
        queue2.add(0, q2Int)
        queue1.removeFirstOrNull()
        doThis(queue1, queue2, count + 1)
        // Q1 POP 후 Q2 Insert
        queue2.add(q1Int)
        doThis(queue1, queue2, count + 1)
    }

    private fun sumList(list: MutableList<Int>): Long {
        var sum: Long = 0L
        list.forEach {
            sum += it.toLong()
        }
        return sum
    }
}

fun main() {
    println(Solution().solution(intArrayOf(3, 2, 7, 2), intArrayOf(4, 6, 5, 1)))

}
