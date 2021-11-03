class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        var replaceStr = ""
        for(i in 0..phone_number.length-5) { replaceStr += "*" }
        answer = phone_number.replaceRange(0, phone_number.length-4, replaceStr)
        return answer
    }
}
