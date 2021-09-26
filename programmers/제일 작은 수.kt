class Solution {
    fun solution(arr: IntArray): IntArray {
        if(arr.size == 1) return intArrayOf(-1)
        var index = 0
        for(i in 0..arr.size - 1){
            if(arr[i] < arr[index]) index = i
        }
        val answer = arr.toMutableList().apply() {
            removeAt(index)
        }
        return answer.toIntArray()
    }
}
