class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        for(num in 1..n){
            if(n % num == 1) { 
                answer = num
                break
            }
        }
        return answer
    }
}
