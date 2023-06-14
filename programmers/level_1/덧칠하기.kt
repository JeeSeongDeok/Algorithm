class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var result = 0
        var nextPaint = -n
        section.forEach {
            if(it >= nextPaint + m) {
                nextPaint = it
                result++
            }
        }
        return result
    }
}
