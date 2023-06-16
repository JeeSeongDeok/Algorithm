class Solution {
    fun solution(s: String): IntArray {
        val answerList = mutableListOf<Int>()
        val stringMap = mutableMapOf<Char, Int>()
        s.forEachIndexed { index, c ->
            if(stringMap[c] == null) {
                stringMap[c] = index
                answerList.add(-1)
            } else {
                answerList.add(index - stringMap[c]!! )
                stringMap[c] = index
            }
        }
        return answerList.toIntArray()
    }
}
