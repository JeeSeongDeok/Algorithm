class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        val answer = ArrayList<Pair<Int, Float>>()
        var remnant = stages.size

        for (i in 1..N) {
            val cnt = stages.filter { it == i }.size
            answer.add(Pair(i, cnt.toFloat() / remnant))
            remnant -= cnt
        }
        
        return answer.sortedWith(compareBy({-it.second}, {it.first}))
            .map { it.first }
            .toIntArray()
    }
}
