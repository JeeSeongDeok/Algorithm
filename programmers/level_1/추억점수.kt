class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): Array<Int> {
        val answer = mutableListOf<Int>()
        val map = mutableMapOf<String, Int>()
        for (i in name.indices) {
            map[name[i]] = yearning[i]
        }

        photo.forEach { names ->
            var count = 0
            names.forEach { friendName ->
                if (map[friendName] != null) {
                    count += map[friendName]!!
                }
            }
            answer.add(count)
        }
        return answer.toTypedArray()
    }
}
