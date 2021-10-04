class Solution {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        var answer = intArrayOf()
        var genresPlayMap = mutableMapOf<String, Int>()
        var playCountMap = mutableMapOf<String, HashMap<Int, Int>>()
        for(i in genres.indices){
            if(genresPlayMap[genres[i]] == null) {
                genresPlayMap[genres[i]] = plays[i]
                playCountMap[genres[i]][plays[i]] = i
            }
            else {
                genresPlayMap[genres[i]] = genresPlayMap[genres[i]]!!.plus(plays[i])
            }
        }
        var sortMap = genresPlayMap.toList().sortedWith(compareByDescending {it.second}).toMap()
        playCountMap
        for(i in sortMap){
            
        }
        
        return answer
    }
}
