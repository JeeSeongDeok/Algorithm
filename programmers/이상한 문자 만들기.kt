class Solution {
    fun solution(s: String): String {
        var answer = ""
        var iCount = 0
        s.forEach {
            if (it == ' ') {
                answer += it
                iCount = -1
            } else if (iCount % 2 == 0) {
                answer += it.toUpperCase()
            } else {
                answer += it.toLowerCase()
            }
            iCount++
        }
        return answer
    }
}
