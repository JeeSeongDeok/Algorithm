class Solution {
    fun solution(n: Int): IntArray {
        var arr = Array<IntArray>(n) { IntArray(n) }
        var row = -1
        var col = 0
        var iCount = 1
        for(i in n downTo 0 step(3)){
            for(j in 0 until i){
                arr[++row][col] = iCount++
            }
            for(j in 0 until i-1){
                arr[row][++col] = iCount++
            }
            for(j in 0 until i-2){
                arr[--row][--col] = iCount++
            }
        }


        return arr.flatMap { it.filter{ num -> num > 0} }.toIntArray()
    }
}
