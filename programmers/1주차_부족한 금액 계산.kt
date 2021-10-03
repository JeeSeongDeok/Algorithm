class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = money.toLong()
        for(i in 1..count){
            answer -= price * i
        }
        if(answer >= 0) return 0
        else return -answer
    }
}
