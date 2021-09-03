class Solution {
    fun solution(s: String): String {
        var answer:String = ""
        var isBlank:Boolean = true
        for(i in 0..s.length - 1){
            if(s[i] == ' '){
                isBlank=true
                answer+= " "
            }
            else if(isBlank){
                answer += s[i].toUpperCase()
                isBlank=false
            }
            else{
                answer += s[i].toLowerCase()
            }
        }

        return answer
    }
}
