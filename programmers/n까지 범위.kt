class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = mutableListOf<Long>()
        repeat(n){ answer.add((x.toLong() + (x.toLong() * it)).toLong()) }
        return answer.toLongArray()
    }
}
