class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 0
        var bridge:MutableList<Int> = mutableListOf<Int>()
        var bridge_weight:Int = 0
        var truckIndex = 0

        for(i in 1..bridge_length)
            bridge.add(0)
        while(bridge.isNotEmpty()){
            if(truck_weights.size == truckIndex){
                bridge.removeAt(0)
            }
            else{
                if(bridge.get(0) != 0){
                    bridge_weight -= bridge.get(0)
                }
                bridge.removeAt(0)
                if(bridge_weight + truck_weights.get(truckIndex) > weight){
                    bridge.add(0)
                }
                else{
                    bridge.add(truck_weights.get(truckIndex))
                    bridge_weight += truck_weights.get(truckIndex)
                    truckIndex++
                }
            }
            answer++

        }
        return answer
    }
}
