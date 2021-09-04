class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val convert: IntArray = intArrayOf(6,6,5,4,3,2,1)
        lottos.sort()
        win_nums.sort()
        var zeroCount:Int = 0
        var successCount:Int = 0
        for(i in lottos){
            if(i == 0){
                zeroCount += 1
                continue
            }
            for(j in 0..win_nums.size-1){
                if(i == win_nums[j]){
                    successCount += 1
                    break
                }
            }
        }
        answer = intArrayOf(convert[successCount], convert[successCount])
        if(zeroCount != 0){
            answer[0] = convert[successCount+zeroCount]
        }
        
        return answer
    }
}
