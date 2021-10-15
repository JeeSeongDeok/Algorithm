class Solution {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        var map = mutableMapOf<String, MutableMap<Int, Int>>()
        var playMap = mutableMapOf<String, Int>()
        // 데이터 채우기
        for(i in genres.indices){
            if(map[genres[i]].isNullOrEmpty()){
                map[genres[i]] = mutableMapOf(Pair(i, plays[i]))
                playMap[genres[i]] = plays[i]
            }else{
                map[genres[i]]?.put(i , plays[i])
                playMap[genres[i]] = playMap[genres[i]]!!.plus(plays[i])
            }
        }
        // 장르 1등
        var playSort = playMap.toList().sortedWith(compareByDescending { it.second }).toMap()

        for(i in playSort){
            var music = map[i.key]?.toList()?.sortedWith(compareByDescending { it.second })?.toMap()
            var iCount = 0
            run{
                music?.forEach {
                    answer.add(it.key)
                    iCount += 1
                    if(iCount == 2) return@run
                }
            }
        }
        println("$playSort")
        println("$map")
        return answer.toIntArray()
    }
}
