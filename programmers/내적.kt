class Solution {
    fun solution(a: IntArray, b: IntArray): Int = 
        a.foldIndexed(0) { index, sum, num -> sum + num * b[index] }
}
