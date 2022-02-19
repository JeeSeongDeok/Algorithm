import java.util.*

class Solution {
    fun solution(jobs: Array<IntArray>): Int {
    var answer = 0

    // 소요 시점 순으로 오름차순 정렬, 같다면 요청 시간 순으로 오름차순 정렬
    var q = PriorityQueue<IntArray>(compareBy({it[1]},{it[0]}))

    // 요청 시점 순으로 오름차순 정렬, 같다면 소요 시간 순으로 오름차순 정렬
    var q2 = PriorityQueue<IntArray>(compareBy({it[0]},{it[1]}))
    var two = 0

    q2.addAll(jobs)

    // 모든 작업이 끝날 때까지
    while (!q.isEmpty() || !q2.isEmpty()) {

        // q2에서 할수 있는 작업들을 q에 다 넣어줌
        while (!q2.isEmpty() && q2.peek()[0] <= two) {
            q.add(q2.poll())
        }

        // 소요 시간 짧은 것부터 수행
        if (!q.isEmpty()) {
            two += q.peek()[1]
            // 시간 누적
            answer += two - q.peek()[0]
            q.poll()
        }

        // q2는 남아있지만 수행할 수 있는 작업이 없을 때
        else if (!q2.isEmpty()) {
            two = q2.peek()[0]
        }
    }
       
        return answer/jobs.size
    }
}
