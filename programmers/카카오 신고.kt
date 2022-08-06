class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val map = mutableMapOf<String, MutableList<String>>()
        val sendMailMap = mutableMapOf<String, Int>()

        // init map
        id_list.forEach {
            map[it] = mutableListOf()
            sendMailMap[it] = 0
        }

        report.forEach {
            val token = it.split(" ")
            val reportUser = token[0]
            val badUser = token[1]
            if (!map[badUser]!!.contains(reportUser))
                map[badUser]!!.add(reportUser)
        }

        map.forEach {
            if (it.value.size >= k) {
                it.value.forEach { user ->
                    sendMailMap[user] = sendMailMap[user]!! + 1
                }
            }
        }

        answer = sendMailMap.values.toIntArray()

        return answer
    }
}
