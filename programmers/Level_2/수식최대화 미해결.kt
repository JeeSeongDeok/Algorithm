
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
            var firstNum: Int = 0
            var secondNum: Int = 0
            var number: String = ""
            // 피 연산자 앞에 꺼
            for(cIndex in token[i].indices.reversed()){
                var ch = token[i][cIndex]
                if(ch in '0'..'9'){ number += ch.toString() }
                else if (ch == '-' && token[i].getOrNull(cIndex-1) == '-') {
                    number.reversed().toInt() * -1
                    break
                }
                else {
                    number.reversed().toInt()
                    break
                }
            }
            number = ""
            // 피 연산자 뒤에 꺼
            for(cIndex in token[i+1].indices){
                var ch = token[i][cIndex]
                if(ch in '0'..'9'){ number += ch.toString() }
                else if (ch == '-' && token[i].getOrNull(cIndex+1) == '-') {
                    number.toInt() * -1
                    break
                }
                else {
                    number.toInt()
                    break
                }
            }
            println("$firstNum, $secondNum")
            // 연산자 위치 확인 후 스트링 자르기
            when(operation){
                "-"->{
                    result = firstNum - secondNum.toInt()
                }
                "*"->{
                    result = firstNum * secondNum.toInt()
                }
                "+"->{
                    result = firstNum + secondNum.toInt()
                }
            }
            str = str.replaceFirst("${firstNum}$operation$secondNum", result.toString())
            println(str)
        }
    }

}
fun main(){
    Solution().solution("100-200*300-500+20")
}
