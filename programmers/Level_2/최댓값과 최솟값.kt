class Solution {
    fun solution(s: String): String {
        val intArray = s.split(" ").map{it.toInt()}
        val max = intArray.max()
        val min = intArray.min()
        var answer = "$min $max"
        return answer
    }
}
