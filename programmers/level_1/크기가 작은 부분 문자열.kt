class Solution {
    fun solution(t: String, p: String): Int {
        val pNum = p.toLong()
        var answer = 0
        for (tokenIndex in 0 .. t.length - p.length) {
            val tNum = t.slice(tokenIndex until tokenIndex + p.length).toLong()
            if (pNum >= tNum) {
                answer += 1
            }
        }
        return answer
    }
}
