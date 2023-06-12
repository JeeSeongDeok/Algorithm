class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        val nameMap = mutableMapOf<Int, String>()
        val raceMap = mutableMapOf<String, Int>()
        players.forEachIndexed { index, name ->
            nameMap[index] = name
            raceMap[name] = index
        }

        callings.forEach { name ->
            val index = raceMap[name]!!
            val frontName = nameMap[index - 1]!!
            nameMap[index - 1] = name
            nameMap[index] = frontName
            raceMap[name] = index - 1
            raceMap[frontName] = index
        }
        return nameMap.values.toTypedArray()
    }
}
