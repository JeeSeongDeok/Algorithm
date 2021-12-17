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

import kotlin.math.abs

// class Solution {
//     val result = mutableListOf<Long>()
//     val set = arrayOf("+", "-", "*")
//     var check = BooleanArray(3)

//     fun solution(expression: String): Long {
//         val value = expression.split("+", "-", "*").map { it.toLong() }.toMutableList()
//         val phase = mutableListOf<String>()
//         expression.forEach { if (it !in '0'..'9') phase.add(it.toString()) }

//         for (oper in set.indices) {
//             check.fill(false)
//             check[oper] = true
//             dfs(set[oper], value, phase)
//         }

//         return result.max()!!
//     }

//     fun dfs(operator: String, nextValue: MutableList<Long>, nextPhase: MutableList<String>) {

//         val newValue = mutableListOf<Long>()
//         newValue.addAll(nextValue)
//         val newPhase = mutableListOf<String>()
//         newPhase.addAll(nextPhase)

//         if (newValue.size > 2) {
//             repeat(newPhase.count { it == operator }) {
//                 val index = newPhase.indexOfFirst { it == operator }
//                 var operand1 = newValue[index]
//                 var operand2 = newValue[index + 1]

//                 newValue[index] = calculation(operand1, operator, operand2)
//                 newValue.removeAt(index + 1)
//                 newPhase.removeAt(index)

//                 if (newPhase.size == 1) {
//                     result.add(abs(calculation(newValue[0], newPhase[0], newValue[1])))
//                     return
//                 }
//             }
//         } else {
//             result.add(abs(calculation(newValue[0], newPhase[0], newValue[1])))
//             return
//         }

//         for (oper in check.indices) {
//             if (check[oper]) continue
//             check[oper] = true
//             dfs(set[oper], newValue, newPhase)
//             check[oper] = false
//         }

//     }

//     fun calculation(operand1: Long, operator: String, operand2: Long): Long {
//         return when (operator) {
//             "*" -> (operand1 * operand2)
//             "+" -> (operand1 + operand2)
//             else -> (operand1 - operand2)
//         }
//     }
// }
