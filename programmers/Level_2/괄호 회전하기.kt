class Solution {
    fun solution(s: String): Int {
        var str = s
        var answer: Int = 0
        for(i in str.indices){
            var stack = mutableListOf<Char>()
            var sIndex = -1
            var isBreak = false
            for(j in str.indices){
                when(str[j]){
                    '[' -> {
                        sIndex += 1
                        stack.add(str[j])
                    }
                    ']' -> {
                        if(sIndex == -1 || stack[sIndex] != '[') {
                            isBreak = true
                        } else {
                            stack.removeAt(sIndex)
                            sIndex -= 1
                        }
                    }
                    '{' -> {
                        sIndex += 1
                        stack.add(str[j])
                    }
                    '}' -> {
                        if(sIndex == -1 || stack[sIndex] != '{') {
                            isBreak = true
                        } else {
                            stack.removeAt(sIndex)
                            sIndex -= 1
                        }
                    }
                    '(' -> {
                        sIndex += 1
                        stack.add(str[j])
                    }
                    ')' -> {
                        if(sIndex == -1 || stack[sIndex] != '(') {
                            isBreak = true
                        } else {
                            stack.removeAt(sIndex)
                            sIndex -= 1
                        }
                    }
                }
                if(isBreak) break
            }
            if(!isBreak && stack.isEmpty())
                answer += 1
            var tmp = str[0]
            str = str.drop(1) + tmp
        }
        return answer
    }
}
