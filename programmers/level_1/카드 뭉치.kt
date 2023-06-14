class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var card1Index = 0
        var card2Index = 0
        goal.forEach { word ->
            if(cards1.size > card1Index && cards1[card1Index] == word) {
                card1Index++
            } else if (cards2.size > card2Index && cards2[card2Index] == word) {
                card2Index++
            } else {
                return "No"
            }
        }
        return "Yes"
    }
}
