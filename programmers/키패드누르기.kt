import kotlin.math.abs


class Solution {

    fun solution(numbers: IntArray, hand: String): String {
        var left = Pair<Int,Int>(3, 0)
        var right = Pair<Int,Int>(3, 2)
        var answer = ""

        for(number in numbers){
            when (number) {
                1, 4, 7 -> {
                    left = Pair((number-1) / 3, (number - 1) % 3)
                    answer += "L"
                }
                3, 6, 9 -> {
                    right = Pair((number-1) / 3, (number - 1) % 3)
                    answer += "R"
                }
                else -> {
                    var distance = if(number == 0) {
                        Pair<Int, Int>(3, 1)
                    } else {
                        Pair<Int, Int>((number-1) / 3, (number - 1 ) % 3)
                    }
                    var leftDistance = abs(distance.first - left.first) + abs(distance.second - left.second)
                    var rightDistance = abs(distance.first - right.first) + abs(distance.second - right.second)

                    if(leftDistance < rightDistance) {
                        left = distance
                        answer += "L"
                    } else if(leftDistance > rightDistance) {
                        right = distance
                        answer += "R"
                    } else{
                        when(hand){
                            "left" -> {
                                left = distance
                                answer += "L"
                            }
                            "right" ->{
                                right = distance
                                answer += "R"
                            }
                        }
                    }
                }
            }
        }
        return answer
    }
}
