class Solution {
    fun solution(targets: Array<IntArray>): Int {
        val sortTarget = targets.toMutableList().sortedWith(compareBy({ it[0] }, { it[1] }))
        var max = -1
        var min = -1
        var count = 0
        sortTarget.forEach {
            if (max > it[1]) {
                max = it[1]
            } else if (max > it[0] || min >= it[0]) {
                min = it[0]
            } else {
                count++
                max = it[1]
                min = it[0]
            }
        }

        return count
    }
}
