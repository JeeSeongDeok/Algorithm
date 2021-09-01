class Solution {
    
    fun solution(n: Int): Int {
        var answer = ArrayList<Int>()
        for(i in 0..n){
            if(i == 0)
                answer.add(0)
            else if(i == 1)
                answer.add(1)
            else{
                var sum = answer[i-1] + answer[i-2]
                answer.add(sum%1234567)
            }
        }
        
        return answer[n]
    }
}

// 실패 코드
// class Solution {
//     fun F(n:Int): Int{
//         if(n == 0)
//             return 0
//         else if(n == 1)
//             return 1
//         else{
//             var sum = 0
//             sum += F(n-1) + F(n-2)
//             return sum
//         }
//     }
    
//     fun solution(n: Int): Int {
//         var answer = 0
//         answer = F(n)
        
//         return answer
//     }
// }
