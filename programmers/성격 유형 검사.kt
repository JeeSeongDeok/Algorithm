class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer: String = ""
        val map = mutableMapOf<Char, Int>()
        val list = listOf<String>("RT", "CF", "JM", "AN")
        // map init
        list.forEach {
            map[it[0]] = 0
            map[it[1]] = 0
        }

        survey.forEachIndexed { index, s ->
            val score = choices[index]
            if (score < 4) {
                when(score) {
                    1->  map[s[0]] = map[s[0]]!! + 3
                    2->  map[s[0]] = map[s[0]]!! + 2
                    3->  map[s[0]] = map[s[0]]!! + 1
                }
            } else if (score > 4) {
                when(score) {
                    5-> map[s[1]] = map[s[1]]!! + 1
                    6-> map[s[1]] = map[s[1]]!! + 2
                    7-> map[s[1]] = map[s[1]]!! + 3
                }
            }
        }

        list.forEach {
            answer += if (map[it[0]]!! >= map[it[1]]!!) {
                it[0]
            } else {
                it[1]
            }
        }
        return answer
    }
}
