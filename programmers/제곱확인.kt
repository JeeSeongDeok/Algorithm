class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 1

        while (answer * answer < n) {
            answer += 1
        }
        return if(answer * answer != n) -1
        else (answer + 1)  * (answer + 1)
    }
}
