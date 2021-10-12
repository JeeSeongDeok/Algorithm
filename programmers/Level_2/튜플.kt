class Solution {
    fun solution(s: String): IntArray {
        // { 와 } 제거
        var newS = s.replace("{", "").replace("}", "")
        // , split
        var splitS = newS.split(",")

        var map = mutableMapOf<Int, Int>()
        for(i in splitS){
            if(map[i.toInt()] == null){
                map[i.toInt()] = 1
            } else{
                map[i.toInt()] = map[i.toInt()]!!.plus(1)
            }
        }
        map = map.toList().sortedByDescending { it.second }.toMap() as MutableMap<Int, Int>
        return map.keys.toIntArray()
    }
}
