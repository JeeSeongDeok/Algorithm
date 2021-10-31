import kotlin.math.exp

class Solution {
    var str:String = ""
    fun solution(expression: String): Long {
        var answer: Long = 0

        str = expression

        var token = str.split('*')
        call(token, "*")
        token = str.split('+')
        call(token, "+")
        token = str.split("-")
        call(token, "-")
        println(str)
        // - + *

        // * + -

        // * - +

        return answer
    }
    fun call(token:List<String>, operation:String){
        var result = 0

        for(i in token.indices){
            // Out of Index 일 시
            if(i+1 == token.size) { break }
            var firstNum: String = ""
            var secondNum: String = ""
            // 피 연산자 앞에 꺼
            for(ch in token[i].reversed()){
                if(ch in '0'..'9'){ firstNum += ch.toString() }
                else { break }
            }
            // 피 연산자 뒤에 꺼
            for(ch in token[i+1]){
                if(ch in '0'..'9'){ secondNum += ch.toString() }
                else { break }
            }
            // 연산자 위치 확인 후 스트링 자르기
            when(operation){
                "-"->{
                    result = firstNum.reversed().toInt() - secondNum.toInt()
                }
                "*"->{
                    result = firstNum.reversed().toInt() * secondNum.toInt()
                }
                "+"->{
                    result = firstNum.reversed().toInt() + secondNum.toInt()
                }
            }
            str = str.replaceFirst("${firstNum.reversed()}$operation$secondNum", result.toString())
            println(str)
        }
    }
}
fun main(){
    Solution().solution("100-200*300-500+20")
}
