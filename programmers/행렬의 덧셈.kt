class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        arr1.forEachIndexed { index, arr ->  
            for (i in arr.indices) {
                arr[i] += arr2[index][i] 
            }
        } 
        return arr1
    }
}
