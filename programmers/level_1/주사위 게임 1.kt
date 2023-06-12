/**
 * a와 b가 모두 홀수라면 a2 + b2 점을 얻습니다.
 * a와 b 중 하나만 홀수라면 2 × (a + b) 점을 얻습니다.
 * a와 b 모두 홀수가 아니라면 |a - b| 점을 얻습니다.
 */
class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        if (a % 2 == 1 && b % 2 == 1) {
            answer = a * a + b * b
        } else if (a % 2 == 1 || b % 2 == 1) {
            answer = 2 * (a + b)
        } else {
            answer = Math.abs(a-b)
        }
        return answer
    }
}
