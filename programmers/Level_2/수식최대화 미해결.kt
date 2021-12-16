class Solution {
    fun calculator(
        number: MutableList<String>,
        operator: MutableList<Char>,
        firstChar: Char, secondChar: Char,
        thirdChar: Char
    ): Long {
        var result: Long = 0
        // 우선순위
        while (operator.indexOf(firstChar) != null) {
            
        }


        return result
    }

    fun solution(expression: String): Long {
        var answer: Long = 0
        // 숫자들의 모임
        var numberList = expression
            .replace("-", " ")
            .replace("+", " ")
            .replace("*", " ")
            .split(" ")
            .toMutableList()
        // 오퍼레이터
        val operatorList = mutableListOf<Char>()
        var index = 0
        numberList.forEach {
            index += it.length
            if (index + operatorList.size < expression.length) {
                val operator = expression[index + operatorList.size]
                operatorList.add(operator)
            }
        }
        calculat(expression)
        return answer
    }
}

fun main() {
    println(Solution().solution("100-200*300-500+20"))
}
