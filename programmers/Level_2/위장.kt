class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        var c_hash = HashMap<String, Int>()
        
        // 옷들을 hashmap으로 넣기
        for(cIndex in clothes){
            // 종류가 존재하는 경우
            if(c_hash.containsKey(cIndex[1])){
                c_hash.put(cIndex[1], c_hash.get(cIndex[1])!!.plus(1))
            }
            // 처음 종류인 경우
            else{
                c_hash.put(cIndex[1], 1)
            }
        }
        // 옷+1 1은 아무것도 입지 않은 경우, 이 경우를 곱하면 경우의 수가 나옴.
        for ((value) in c_hash) { 
            answer = (value + 1) * answer
	    }
        // 그 중 모든 옷을 입지 않은 경우를 하나를 뺌
        return answer - 1
    }
}
