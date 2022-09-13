class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""

        s.forEach {
            answer += if (it.isLowerCase() && it + n > 'z') {
                val gap = n - ('z' - it) - 1
                ('a' + gap)
            } else if (it.isUpperCase() && it + n > 'Z') {
                val gap = n - ('Z' - it) - 1
                ('A' + gap)
            } else if (it == ' ') {
                ' '
            } else {
                (it + n)
            }
        }

        return answer
    }
}
