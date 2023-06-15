class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val answer = mutableListOf<Int>()
        val termMap = mutableMapOf<String, Int>()
        terms.forEach {
            val termToken = it.split(" ")
            termMap[termToken[0]] = termToken[1].toInt()
        }

        val todayToken = today.split(".").toMutableList().map { it.toInt() }
        privacies.forEachIndexed { privacyIndex, privacy ->
            val privacyToken = privacy.split(" ")
            val deadLineDay = privacyToken[0].split(".").map { it.toInt() }.toMutableList()
            val deadLine = termMap[privacyToken[1]]!!

            deadLineDay[0] = deadLineDay[0] + ((deadLineDay[1] + deadLine) / 12)
            if ((deadLineDay[1] + deadLine) % 12 == 0) {
                deadLineDay[0] -= 1
            }
            deadLineDay[1] = (deadLineDay[1] + deadLine) % 12
            if (deadLineDay[1] == 0) {
                deadLineDay[1] = 12
            }
            if (deadLineDay[2] - 1 == 0) {
                if (deadLineDay[1] - 1 == 0) {
                    deadLineDay[0] = deadLineDay[0] - 1
                    deadLineDay[1] = 12
                    deadLineDay[2] = 28
                } else {
                    deadLineDay[1] = deadLineDay[1] - 1
                    deadLineDay[2] = 28
                }
            } else {
                deadLineDay[2] = deadLineDay[2] - 1
            }
            if (todayToken[0] > deadLineDay[0]) {
                answer.add(privacyIndex + 1)
            } else if (
                todayToken[0] == deadLineDay[0] &&
                todayToken[1] > deadLineDay[1]
            ) {
                answer.add(privacyIndex + 1)
            } else if (
                todayToken[0] == deadLineDay[0] &&
                todayToken[1] == deadLineDay[1] &&
                todayToken[2] > deadLineDay[2]
            )
                answer.add(privacyIndex + 1)
        }
        return answer.toIntArray()
    }
}
