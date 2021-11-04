class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        for(num in left..right){
            var iCount = 0

            for(seq in 1..num){
                if(num % seq == 0) { iCount+=1 }
            }
            if(iCount % 2 == 0) { answer += num }
            else { answer -= num }
        }
        return answer
    }
}
