class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        var sum = 0

        x.toString().map {
            sum += (it.toInt() - '0'.toInt())
        }
        return x % sum == 0
    }
}
