class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 45
        for(i in numbers){
            answer -= i
        }
        return answer
    }
}
