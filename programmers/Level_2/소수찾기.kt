class Solution {
    fun <T> combination(answer: MutableList<List<T>>, el: List<T>, ck: Array<Boolean>, start: Int, target: Int) {
        if(target == 0) {
            answer.addAll( listOf(el.filterIndexed { index, t -> ck[index] }) )
        } else {
            for(i in start until el.size) {
                ck[i] = true
                combination(answer, el, ck, i + 1, target - 1)
                ck[i] = false
            }
        }
    }
    // 순열
    fun <T> permutation(el: List<T>, fin: List<T> = listOf(), sub: List<T> = el ): List<List<T>> {
        return if(sub.isEmpty()) listOf(fin)
        else sub.flatMap { permutation(el, fin + it, sub - it) }
    }
    // 소수 확인
    fun findPrime(N:Int):Boolean{

        for(index in 2 until N){
            if(N % index == 0) return false
        }
        return N > 1
    }

    fun solution(numbers: String): Int {
        var answer = mutableListOf<Int>()
        var token = numbers.toMutableList().map { it.toInt() - 48 }
        for(size in 1..token.size){
            var combinationList = mutableListOf<List<Int>>()
            combination(combinationList, token, Array<Boolean>(token.size) { false }, 0, size)
            if(size > 1){
                combinationList.forEach {
                    permutation(it).forEach{ arr->
                        var digit = 1
                        var result = 0
                        for(N in arr.reversed()){
                            result += N * digit
                            digit *= 10
                        }
                        if(findPrime(result)) { answer.add(result) }
                    }
                }
            } else {
                combinationList.forEach { arr-> if(findPrime(arr[0])) { answer.add(arr[0]) } }
            }
        }
        return answer.distinct().size
    }
}
