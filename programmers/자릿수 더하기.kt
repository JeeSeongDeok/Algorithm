class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        for(N in n.toString().indices) { answer += n.toString()[N].toInt() - '0'.toInt() }
        return answer
    }
}
