class Solution {
    fun solution(nums: IntArray): Int {
        var answer = -1

        var combinationList = mutableListOf<List<Int>>()
        combination(combinationList, nums.toList(), Array<Boolean>(nums.size) { false }, 0,  3)
        combinationList.forEach {
            if(primeNum(it.sum())) { answer++ }
        }
        return answer
    }
    // 소수찾기
    fun primeNum(N:Int): Boolean{
        if(N < 2) return false

        for(i in 2..N/2){
            if(N % i == 0) return false
        }

        return true
    }

    // 컴비네이션
    fun <T> combination(answer: MutableList<List<T>>, el: List<T>, ck: Array<Boolean>, start: Int, target: Int) {
        if(target == 0) {
            answer.addAll( listOf(el.filterIndexed { index, t -> ck[index] }) )
        } else {
            for(i in start until el.size) {
                ck[i] = true
                combination(answer, el, ck, i + 1, target - 1)
                ck[i] = false
            }
        }
    }
}
