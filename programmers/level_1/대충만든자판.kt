class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val resultList = mutableListOf<Int>()
        val map = mutableMapOf<Char, Int>()
        keymap.forEach {
            it.forEachIndexed { index, c ->
                if (map[c] != null && map[c]!! > index + 1) {
                    map[c] = index + 1
                } else if (map[c] == null) {
                    map[c] = index + 1
                }
            }
        }

        targets.forEach {
            var result = 0
            for (i in it) {
                if (map[i] == null) {
                    result = -1
                    break
                } else {
                    result += map[i]!!
                }
            }
            resultList.add(result)
        }
        return resultList.toIntArray()
    }
}
