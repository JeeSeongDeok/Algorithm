class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf(-1, -1)
        var yellowWidth = 0
        var yellowHeight = 0
        var sum = Int.MAX_VALUE

        for (width in 1 .. yellow) {
            yellowWidth = width
            yellowHeight = yellow / yellowWidth
            sum = (yellowWidth + yellowHeight) * 2 + 4
            if(sum == brown && yellowWidth * yellowHeight == yellow) break
        }

        answer[0] = yellowHeight + 2
        answer[1] = yellowWidth + 2
        return answer
    }
}
